import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

/**
 * A scene factory to handle the various scenes within the game.
 *
 * @author KMB
 * @version 0.1.0
 * @since 4/12/2026
 */
public class SceneFactory {

    public static Scene create(SceneType type){
        return switch (type){
            case LOGIN -> buildLogin();
        };
    }

    /**
     * Builds the scene for login/register. Pulls the scene information from LoginScene.fxml
     * @return the working scene
     */
    private static Scene buildLogin(){

        FXMLLoader loginLoader = new FXMLLoader(SceneFactory.class.getResource("/trivia/LoginScene.fxml"));
        try{
            System.out.println(SceneFactory.class.getResource("/trivia/LoginScene.fxml"));
            Parent root = loginLoader.load();
            return new Scene(root);
        } catch(IOException e){
            System.out.println("Failed to load Login Scene");
            throw new RuntimeException(e);
        }
    }
}

/*
 * Copyright (c) 2013. by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.cifpcarlos3.fxled;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        
        try {
             FXMLLoader loader = new FXMLLoader();
             loader.setLocation(Main.class.getResource("/vista/Led_Vista.fxml"));
             javafx.scene.layout.Pane ventana = (javafx.scene.layout.Pane) loader.load();
             
             // Show the scene containing the root layout.
             javafx.scene.Scene scene = new javafx.scene.Scene(ventana);
             primaryStage.setScene(scene);
             primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
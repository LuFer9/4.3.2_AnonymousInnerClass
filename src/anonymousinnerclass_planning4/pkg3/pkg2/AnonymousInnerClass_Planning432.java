/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass_planning4.pkg3.pkg2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class AnonymousInnerClass_Planning432 extends Application {
          
    @Override
    public void start(Stage primaryStage) {
        
        //Elegimos el layout
        HBox root = new HBox(10);
        root.setAlignment(Pos.CENTER);
        
        //Creamos nuestra escena
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Anonymous InnerClass");
        primaryStage.setScene(scene);
        
        //Creamos los botones con sus respectivos eventos en una clase anonima
        Button btn_new = new Button();
        btn_new.setText("New");
        btn_new.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo proceso");
            }
        });
        
        Button btn_open = new Button();
        btn_open.setText("Open");
        btn_open.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir proceso");
            }
        });
        
        Button btn_save = new Button();
        btn_save.setText("Save");
        btn_save.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar proceso");
            }
        });
        
        Button btn_print = new Button();
        btn_print.setText("Print");
        btn_print.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir proceso");
            }
        });
        
        root.getChildren().addAll(btn_new, btn_open, btn_save, btn_print);
        primaryStage.show();
        
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

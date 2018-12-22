
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExtraCredit_01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CSCE145 Grade Calculator");


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

   
        Text sceneTitle = new Text("CSCE145 Grade Calculator");
        sceneTitle.setFont(Font.font("papyrus", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label labs = new Label("Lab Assignments:");
        grid.add(labs, 0, 1);
        TextField labsText = new TextField();
        grid.add(labsText, 1, 1);

        Label reports = new Label("Lab Reports:");
        grid.add(reports, 0, 2);
        TextField reportsText = new TextField();
        grid.add(reportsText, 1, 2);

        Label labExam = new Label("Lab Tests:");
        grid.add(labExam, 0, 3);
        TextField labExamText = new TextField();
        grid.add(labExamText, 1, 3);

        Label hw = new Label("HW Assignments:");
        grid.add(hw, 0, 4);
        TextField hwText = new TextField();
        grid.add(hwText, 1, 4);
 
        Label paperTest = new Label("2 Tests:");
        grid.add(paperTest, 0, 5);
        TextField paperTestText = new TextField();
        grid.add(paperTestText, 1, 5);

        Label finalExam = new Label("Final:");
        grid.add(finalExam, 0, 6);
        TextField finalExamText = new TextField();
        grid.add(finalExamText, 1, 6);

        Label extra = new Label("Extra Credit:");
        grid.add(extra, 0, 7);
        TextField extraText = new TextField();
        grid.add(extraText, 1, 7);
        
        //grid.setGridLinesVisible(true);

        Label avg = new Label("Average:");
        grid.add(avg, 0, 9);

        //button created 
        Button btn = new Button("Calculate Average");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 8);

        final Text calcAvg = new Text();
        grid.add(calcAvg, 1, 9);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double labAssn = Double.parseDouble(labsText.getText()) * .20;
                double labReport = Double.parseDouble(reportsText.getText()) * .10;
                double labExam = Double.parseDouble(labExamText.getText()) * .20;
                double hw = Double.parseDouble(hwText.getText()) * .20;
                double paperTest = Double.parseDouble(paperTestText.getText()) * .20;
                double f = Double.parseDouble(finalExamText.getText()) * .10; //f is for the finalExam
                double eCredit = Double.parseDouble(extraText.getText()) * .10;
                double total = labAssn + labReport + labExam + hw + paperTest + f + eCredit;
                calcAvg.setText(Double.toString(total));
            }
        });

        Scene scene = new Scene(grid, 335, 375);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}




 
import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.PasswordField; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.HBox; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
 
public class ExtraCredit01 extends Application{ 
      public static void main(String[] args) { 
        launch(args); 
    } 
   
@Override 
    public void start(Stage primaryStage) { 
        primaryStage.setTitle("CSCE145 Grade Calculator"); 
        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER); 
        grid.setHgap(10); 
        grid.setVgap(10); 
        grid.setPadding(new Insets(25, 25, 25, 25)); 
        Text scenetitle = new Text("CSCE145 Grade Calculator"); 
        scenetitle.setFont(Font.font("Calibri", FontWeight.BOLD, 25)); 
        grid.add(scenetitle, 0, 0, 2, 1); 
         
        Label LabA = new Label("Lab Assignments:"); 
        grid.add(LabA, 0, 1); 
         
        TextField LabATF = new TextField(); 
        grid.add(LabATF, 1, 1); 
 
        Label LabR = new Label("Lab Reports"); 
        grid.add(LabR, 0, 2); 
 
        TextField LabRTF = new TextField(); 
        grid.add(LabRTF, 1, 2); 
 
        Label LabT = new Label("Lab Tests:"); 
        grid.add(LabT, 0, 3); 
 
        TextField LabTTF = new TextField(); 
        grid.add(LabTTF, 1, 3); 
         
        Label HwA = new Label("Homework Assignments:"); 
        grid.add(HwA, 0, 4); 
         
        TextField HwATF = new TextField(); 
        grid.add(HwATF, 1, 4); 
         
        Label TwoTest = new Label("Two Tests:"); 
        grid.add(TwoTest, 0, 5); 
         
        TextField TwoTestTF = new TextField(); 
        grid.add(TwoTestTF, 1, 5); 
         
        Label Final = new Label("Final:"); 
        grid.add(Final, 0, 6); 
         
        TextField FinalTF = new TextField(); 
        grid.add(FinalTF, 1, 6); 
         
        Label Ec = new Label("Extra Credit:"); 
        grid.add(Ec, 0, 7); 
         
        TextField EcTF = new TextField(); 
        grid.add(EcTF, 1, 7); 
         
        Button btn = new Button("Calculate Average"); 
        HBox hbBtn = new HBox(10); 
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT); 
        hbBtn.getChildren().add(btn); 
        grid.add(hbBtn, 1, 8); 
         
        Label Avg = new Label("Average:"); 
        grid.add(Avg, 0, 9); 
         
        final Text actiontarget = new Text(); 
        grid.add(actiontarget, 1, 9); 
         
        btn.setOnAction(new EventHandler<ActionEvent>() { 
  
          @Override 
          public void handle(ActionEvent e) { 
            String LabAG1 = LabATF.getText(); 
            double LabAGF = Double.parseDouble(LabAG1); 
            LabAGF = LabAGF*0.20; 
            String LabRG1 = LabRTF.getText(); 
            double LabRGF = Double.parseDouble(LabRG1); 
            LabRGF = LabRGF*0.10; 
            String LabTG1 = LabTTF.getText(); 
            double LabTGF = Double.parseDouble(LabTG1); 
            LabTGF = LabTGF*0.20; 
            String HwAG1 = HwATF.getText(); 
            double HwAGF = Double.parseDouble(HwAG1); 
            HwAGF = HwAGF*0.20; 
            String TwoTestG1 = TwoTestTF.getText(); 
            double TwoTestGF = Double.parseDouble(TwoTestG1); 
            TwoTestGF = TwoTestGF*0.20; 
            String FinalG1 = FinalTF.getText(); 
            double FinalGF = Double.parseDouble(FinalG1); 
            FinalGF = FinalGF*0.10; 
            String EcG1 = EcTF.getText(); 
            double EcGF = Double.parseDouble(EcG1); 
            EcGF = EcGF/10; 
            double Grade1 = ((LabAGF+LabRGF+LabTGF+HwAGF+TwoTestGF+FinalGF)/1)+EcGF; 
            String GradeF = "" + Grade1; 
            if (Grade1 >= 90.0) 
            { 
              actiontarget.setFill(Color.LIME); 
            } 
            if (Grade1 >= 70.0 && Grade1 < 90.0) 
            { 
              actiontarget.setFill(Color.ORANGE); 
            } 
            if (Grade1 < 70.0) 
            { 
              actiontarget.setFill(Color.RED); 
            } 
            actiontarget.setText(GradeF); 
          } 
        }); 
         
        Scene scene = new Scene(grid, 500, 458); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    } 
} 
 

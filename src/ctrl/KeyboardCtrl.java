package ctrl;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.FlowPane;
import sectionfx.GooeyController;

public class KeyboardCtrl extends GooeyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private FlowPane keyboardPane;

    @FXML
    private Button btnTilde;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn0;

    @FXML
    private Button btnDash;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnQ;

    @FXML
    private Button btnW;

    @FXML
    private Button btnE;

    @FXML
    private Button btnR;

    @FXML
    private Button btnT;

    @FXML
    private Button btnY;

    @FXML
    private Button btnU;

    @FXML
    private Button btnI;

    @FXML
    private Button btnO;

    @FXML
    private Button btnP;

    @FXML
    private Button btnOpenBracket;

    @FXML
    private Button btnClosedBracket;

    @FXML
    private Button btnBackslash;

    @FXML
    private Button btnA;

    @FXML
    private Button btnS;

    @FXML
    private Button btnD;

    @FXML
    private Button btnF;

    @FXML
    private Button btnG;

    @FXML
    private Button btnH;

    @FXML
    private Button btnJ;

    @FXML
    private Button btnK;

    @FXML
    private Button btnL;

    @FXML
    private Button btnSemicolon;

    @FXML
    private Button btnQuotes;

    @FXML
    private Button btnEnter;

    @FXML
    private Button btnLShift;

    @FXML
    private Button btnZ;

    @FXML
    private Button btnX;

    @FXML
    private Button btnC;

    @FXML
    private Button btnV;

    @FXML
    private Button btnB;

    @FXML
    private Button btnN;

    @FXML
    private Button btnM;

    @FXML
    private Button btnComma;

    @FXML
    private Button btnPeriod;

    @FXML
    private Button btnSlash;

    @FXML
    private Button btnRShift;

    private HashMap<KeyCode, Button> btnMap;

    @FXML
    void initialize() {
        btnMap = new HashMap<>();

        btnMap.put(KeyCode.DEAD_TILDE, btnTilde);
        btnMap.put(KeyCode.DIGIT1, btn1);
        btnMap.put(KeyCode.DIGIT2, btn2);
        btnMap.put(KeyCode.DIGIT3, btn3);
        btnMap.put(KeyCode.DIGIT4, btn4);
        btnMap.put(KeyCode.DIGIT5, btn5);
        btnMap.put(KeyCode.DIGIT6, btn6);
        btnMap.put(KeyCode.DIGIT7, btn7);
        btnMap.put(KeyCode.DIGIT8, btn8);
        btnMap.put(KeyCode.DIGIT9, btn9);
        btnMap.put(KeyCode.DIGIT0, btn0);

        btnMap.put(KeyCode.A, btnA);
        btnMap.put(KeyCode.B, btnB);
        btnMap.put(KeyCode.C, btnC);
        btnMap.put(KeyCode.D, btnD);
        btnMap.put(KeyCode.E, btnE);
        btnMap.put(KeyCode.F, btnF);
        btnMap.put(KeyCode.G, btnG);
        btnMap.put(KeyCode.H, btnH);
        btnMap.put(KeyCode.I, btnI);
        btnMap.put(KeyCode.J, btnJ);
        btnMap.put(KeyCode.K, btnK);
        btnMap.put(KeyCode.L, btnL);
        btnMap.put(KeyCode.M, btnM);
        btnMap.put(KeyCode.N, btnN);
        btnMap.put(KeyCode.O, btnO);
        btnMap.put(KeyCode.P, btnP);
        btnMap.put(KeyCode.Q, btnQ);
        btnMap.put(KeyCode.R, btnR);
        btnMap.put(KeyCode.S, btnS);
        btnMap.put(KeyCode.T, btnT);
        btnMap.put(KeyCode.U, btnU);
        btnMap.put(KeyCode.V, btnV);
        btnMap.put(KeyCode.W, btnW);
        btnMap.put(KeyCode.X, btnX);
        btnMap.put(KeyCode.Y, btnY);
        btnMap.put(KeyCode.Z, btnZ);

        btnMap.put(KeyCode.OPEN_BRACKET, btnOpenBracket);
        btnMap.put(KeyCode.CLOSE_BRACKET, btnClosedBracket);
        btnMap.put(KeyCode.BACK_SLASH, btnBackslash);
        btnMap.put(KeyCode.SEMICOLON, btnSemicolon);
        btnMap.put(KeyCode.QUOTE, btnQuotes);
        btnMap.put(KeyCode.ENTER, btnEnter);
        btnMap.put(KeyCode.COMMA, btnComma);
        btnMap.put(KeyCode.PERIOD, btnPeriod);
        btnMap.put(KeyCode.SHIFT, btnLShift);
    }

    public Button queryBtn(KeyCode keyCode) {
        return btnMap.get(keyCode);
    }

    public ResourceBundle getResources() {
        return resources;
    }

    public URL getLocation() {
        return location;
    }

    public FlowPane getKeyboardPane() {
        return keyboardPane;
    }

    public Button getBtnTilde() {
        return btnTilde;
    }

    public Button getBtn1() {
        return btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public Button getBtn3() {
        return btn3;
    }

    public Button getBtn4() {
        return btn4;
    }

    public Button getBtn5() {
        return btn5;
    }

    public Button getBtn6() {
        return btn6;
    }

    public Button getBtn7() {
        return btn7;
    }

    public Button getBtn8() {
        return btn8;
    }

    public Button getBtn9() {
        return btn9;
    }

    public Button getBtn0() {
        return btn0;
    }

    public Button getBtnDash() {
        return btnDash;
    }

    public Button getBtnEqual() {
        return btnEqual;
    }

    public Button getBtnQ() {
        return btnQ;
    }

    public Button getBtnW() {
        return btnW;
    }

    public Button getBtnE() {
        return btnE;
    }

    public Button getBtnR() {
        return btnR;
    }

    public Button getBtnT() {
        return btnT;
    }

    public Button getBtnY() {
        return btnY;
    }

    public Button getBtnU() {
        return btnU;
    }

    public Button getBtnI() {
        return btnI;
    }

    public Button getBtnO() {
        return btnO;
    }

    public Button getBtnP() {
        return btnP;
    }

    public Button getBtnOpenBracket() {
        return btnOpenBracket;
    }

    public Button getBtnClosedBracket() {
        return btnClosedBracket;
    }

    public Button getBtnBackslash() {
        return btnBackslash;
    }

    public Button getBtnA() {
        return btnA;
    }

    public Button getBtnS() {
        return btnS;
    }

    public Button getBtnD() {
        return btnD;
    }

    public Button getBtnF() {
        return btnF;
    }

    public Button getBtnG() {
        return btnG;
    }

    public Button getBtnH() {
        return btnH;
    }

    public Button getBtnJ() {
        return btnJ;
    }

    public Button getBtnK() {
        return btnK;
    }

    public Button getBtnL() {
        return btnL;
    }

    public Button getBtnSemicolon() {
        return btnSemicolon;
    }

    public Button getBtnQuotes() {
        return btnQuotes;
    }

    public Button getBtnEnter() {
        return btnEnter;
    }

    public Button getBtnLShift() {
        return btnLShift;
    }

    public Button getBtnZ() {
        return btnZ;
    }

    public Button getBtnX() {
        return btnX;
    }

    public Button getBtnC() {
        return btnC;
    }

    public Button getBtnV() {
        return btnV;
    }

    public Button getBtnB() {
        return btnB;
    }

    public Button getBtnN() {
        return btnN;
    }

    public Button getBtnM() {
        return btnM;
    }

    public Button getBtnComma() {
        return btnComma;
    }

    public Button getBtnPeriod() {
        return btnPeriod;
    }

    public Button getBtnSlash() {
        return btnSlash;
    }

    public Button getBtnRShift() {
        return btnRShift;
    }
}

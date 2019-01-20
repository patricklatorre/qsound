package ctrl;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
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
    private HashMap<String, KeyCode> btnIDs;

    @FXML
    void initialize() {
        btnMap = new HashMap<>();
        btnIDs = new HashMap<>();

        btnMap.put(KeyCode.DEAD_TILDE,      btnTilde);

        btnMap.put(KeyCode.DIGIT1,          btn1);
        btnMap.put(KeyCode.DIGIT2,          btn2);
        btnMap.put(KeyCode.DIGIT3,          btn3);
        btnMap.put(KeyCode.DIGIT4,          btn4);
        btnMap.put(KeyCode.DIGIT5,          btn5);
        btnMap.put(KeyCode.DIGIT6,          btn6);
        btnMap.put(KeyCode.DIGIT7,          btn7);
        btnMap.put(KeyCode.DIGIT8,          btn8);
        btnMap.put(KeyCode.DIGIT9,          btn9);
        btnMap.put(KeyCode.DIGIT0,          btn0);

        btnMap.put(KeyCode.A,               btnA);
        btnMap.put(KeyCode.B,               btnB);
        btnMap.put(KeyCode.C,               btnC);
        btnMap.put(KeyCode.D,               btnD);
        btnMap.put(KeyCode.E,               btnE);
        btnMap.put(KeyCode.F,               btnF);
        btnMap.put(KeyCode.G,               btnG);
        btnMap.put(KeyCode.H,               btnH);
        btnMap.put(KeyCode.I,               btnI);
        btnMap.put(KeyCode.J,               btnJ);
        btnMap.put(KeyCode.K,               btnK);
        btnMap.put(KeyCode.L,               btnL);
        btnMap.put(KeyCode.M,               btnM);
        btnMap.put(KeyCode.N,               btnN);
        btnMap.put(KeyCode.O,               btnO);
        btnMap.put(KeyCode.P,               btnP);
        btnMap.put(KeyCode.Q,               btnQ);
        btnMap.put(KeyCode.R,               btnR);
        btnMap.put(KeyCode.S,               btnS);
        btnMap.put(KeyCode.T,               btnT);
        btnMap.put(KeyCode.U,               btnU);
        btnMap.put(KeyCode.V,               btnV);
        btnMap.put(KeyCode.W,               btnW);
        btnMap.put(KeyCode.X,               btnX);
        btnMap.put(KeyCode.Y,               btnY);
        btnMap.put(KeyCode.Z,               btnZ);

        btnMap.put(KeyCode.OPEN_BRACKET,    btnOpenBracket);
        btnMap.put(KeyCode.CLOSE_BRACKET,   btnClosedBracket);
        btnMap.put(KeyCode.BACK_SLASH,      btnBackslash);
        btnMap.put(KeyCode.SEMICOLON,       btnSemicolon);
        btnMap.put(KeyCode.QUOTE,           btnQuotes);
        btnMap.put(KeyCode.ENTER,           btnEnter);
        btnMap.put(KeyCode.COMMA,           btnComma);
        btnMap.put(KeyCode.PERIOD,          btnPeriod);
        btnMap.put(KeyCode.SHIFT,           btnLShift);

        btnIDs.put("`",      KeyCode.DEAD_TILDE);
        btnIDs.put("1",      KeyCode.DIGIT1);
        btnIDs.put("2",      KeyCode.DIGIT2);
        btnIDs.put("3",      KeyCode.DIGIT3);
        btnIDs.put("4",      KeyCode.DIGIT4);
        btnIDs.put("5",      KeyCode.DIGIT5);
        btnIDs.put("6",      KeyCode.DIGIT6);
        btnIDs.put("7",      KeyCode.DIGIT7);
        btnIDs.put("8",      KeyCode.DIGIT8);
        btnIDs.put("9",      KeyCode.DIGIT9);
        btnIDs.put("0",      KeyCode.DIGIT0);
        btnIDs.put("-",      KeyCode.MINUS);
        btnIDs.put("=",      KeyCode.EQUALS);
        btnIDs.put("Q",      KeyCode.Q);
        btnIDs.put("W",      KeyCode.W);
        btnIDs.put("E",      KeyCode.E);
        btnIDs.put("R",      KeyCode.R);
        btnIDs.put("T",      KeyCode.T);
        btnIDs.put("Y",      KeyCode.Y);
        btnIDs.put("U",      KeyCode.U);
        btnIDs.put("I",      KeyCode.I);
        btnIDs.put("O",      KeyCode.O);
        btnIDs.put("P",      KeyCode.P);
        btnIDs.put("[",      KeyCode.OPEN_BRACKET);
        btnIDs.put("]",      KeyCode.CLOSE_BRACKET);
        btnIDs.put("\\",     KeyCode.BACK_SLASH);
        btnIDs.put("A",      KeyCode.A);
        btnIDs.put("S",      KeyCode.S);
        btnIDs.put("D",      KeyCode.D);
        btnIDs.put("F",      KeyCode.F);
        btnIDs.put("G",      KeyCode.G);
        btnIDs.put("H",      KeyCode.H);
        btnIDs.put("J",      KeyCode.J);
        btnIDs.put("K",      KeyCode.K);
        btnIDs.put("L",      KeyCode.L);
        btnIDs.put(";",      KeyCode.SEMICOLON);
        btnIDs.put("'",      KeyCode.QUOTE);
        btnIDs.put("Enter",  KeyCode.ENTER);
        btnIDs.put("Shift",  KeyCode.SHIFT);
        btnIDs.put("Z",      KeyCode.Z);
        btnIDs.put("X",      KeyCode.X);
        btnIDs.put("C",      KeyCode.C);
        btnIDs.put("V",      KeyCode.V);
        btnIDs.put("B",      KeyCode.B);
        btnIDs.put("N",      KeyCode.N);
        btnIDs.put("M",      KeyCode.M);
        btnIDs.put(",",      KeyCode.COMMA);
        btnIDs.put(".",      KeyCode.PERIOD);
        btnIDs.put("/",      KeyCode.SLASH);
    }

    public KeyCode inferKeyCode(String id) {
        return btnIDs.get(id);
    }

    public Button queryBtn(KeyCode keyCode) {
        return btnMap.get(keyCode);
    }

    public Button[] getAllButtons() {
        return new Button[] {
                btnTilde, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
                btn9, btn0,

                btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ,
                btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT,
                btnU, btnV, btnW, btnX, btnY, btnZ,

                btnOpenBracket, btnClosedBracket, btnBackslash, btnSemicolon,
                btnQuotes, btnEnter, btnComma, btnPeriod, btnLShift
        };
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

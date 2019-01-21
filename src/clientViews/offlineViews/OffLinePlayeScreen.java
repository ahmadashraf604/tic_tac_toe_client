package clientViews.offlineViews;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.GridPane.getColumnIndex;
import static javafx.scene.layout.GridPane.getRowIndex;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import tic_tac_toe_client.Tic_tac_toe_client;

public class OffLinePlayeScreen extends AnchorPane {

    protected final HBox hBox;
    protected final ImageView bakgroundImageView;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView imageView6;
    protected final ImageView imageView7;
    protected final HBox hBox0;
    protected final ImageView backImageView;
    protected final Label label;
    Tic_tac_toe_client controller;
    boolean x_Trun = true;
    int rowIndex = 0;
    int columnIndex = 0;
    char cell[][] = new char[3][3];
    int movesCounter = 1;
    int cellFallCounter = -1;
    String firstMove = "";
    boolean isEnd = false;

    public OffLinePlayeScreen(Tic_tac_toe_client controller) {

        this.controller = controller;
        hBox = new HBox();
        bakgroundImageView = new ImageView();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        imageView7 = new ImageView();
        hBox0 = new HBox();
        backImageView = new ImageView();
        label = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: "+controller.SCENE_BACKGROUND);

        AnchorPane.setBottomAnchor(hBox, 30.0);
        AnchorPane.setLeftAnchor(hBox, 30.0);
        AnchorPane.setRightAnchor(hBox, 30.0);
        hBox.setLayoutX(239.5);
        hBox.setLayoutY(49.5);

        bakgroundImageView.setFitHeight(420.0);
        bakgroundImageView.setFitWidth(420.0);
        bakgroundImageView.setOpacity(0.13);
        bakgroundImageView.setPickOnBounds(true);
        bakgroundImageView.setPreserveRatio(true);
        bakgroundImageView.setImage(new Image(getClass().getResourceAsStream("/images/background.png")));
       
        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(420.0);
        gridPane.setPrefWidth(420.0);
        gridPane.setStyle("-fx-background-color: "+controller.SCENE_FORGROUND);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(174.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(140.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(228.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(140.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(219.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(140.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(140.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(140.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(140.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(imageView, 0);
        GridPane.setColumnIndex(imageView, 0);
        imageView.setFitHeight(100.0);
        imageView.setFitWidth(100.0);
        imageView.setOnMousePressed(this::setXO);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        GridPane.setMargin(imageView, new Insets(10.0));

        GridPane.setRowIndex(imageView0, 0);
        GridPane.setColumnIndex(imageView0, 1);
        imageView0.setFitHeight(100.0);
        imageView0.setFitWidth(100.0);
        imageView0.setOnMousePressed(this::setXO);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        GridPane.setMargin(imageView0, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setRowIndex(imageView1, 0);
        GridPane.setColumnIndex(imageView1, 2);
        imageView1.setFitHeight(100.0);
        imageView1.setFitWidth(100.0);
        imageView1.setOnMousePressed(this::setXO);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        GridPane.setMargin(imageView1, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setRowIndex(imageView2, 1);
        GridPane.setColumnIndex(imageView2, 0);
        imageView2.setFitHeight(100.0);
        imageView2.setFitWidth(100.0);
        imageView2.setOnMousePressed(this::setXO);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        GridPane.setMargin(imageView2, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setColumnIndex(imageView3, 1);
        GridPane.setRowIndex(imageView3, 1);
        imageView3.setFitHeight(100.0);
        imageView3.setFitWidth(100.0);
        imageView3.setOnMousePressed(this::setXO);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        GridPane.setMargin(imageView3, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setColumnIndex(imageView4, 2);
        GridPane.setRowIndex(imageView4, 1);
        imageView4.setFitHeight(100.0);
        imageView4.setFitWidth(100.0);
        imageView4.setOnMousePressed(this::setXO);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        GridPane.setMargin(imageView4, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setRowIndex(imageView5, 2);
        GridPane.setColumnIndex(imageView5, 0);
        imageView5.setFitHeight(100.0);
        imageView5.setFitWidth(100.0);
        imageView5.setOnMousePressed(this::setXO);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        GridPane.setMargin(imageView5, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setColumnIndex(imageView6, 1);
        GridPane.setRowIndex(imageView6, 2);
        imageView6.setFitHeight(100.0);
        imageView6.setFitWidth(100.0);
        imageView6.setOnMousePressed(this::setXO);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        GridPane.setMargin(imageView6, new Insets(10.0, 10.0, 10.0, 20.0));

        GridPane.setColumnIndex(imageView7, 2);
        GridPane.setRowIndex(imageView7, 2);
        imageView7.setFitHeight(100.0);
        imageView7.setFitWidth(100.0);
        imageView7.setOnMousePressed(this::setXO);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        GridPane.setMargin(imageView7, new Insets(10.0, 10.0, 10.0, 20.0));

        AnchorPane.setLeftAnchor(hBox0, 30.0);
        AnchorPane.setRightAnchor(hBox0, 30.0);
        AnchorPane.setTopAnchor(hBox0, 12.0);
        hBox0.setLayoutX(30.0);
        hBox0.setLayoutY(12.0);
        hBox0.setPrefHeight(30.0);
        hBox0.setPrefWidth(200.0);

        backImageView.setFitHeight(35.0);
        backImageView.setFitWidth(30.0);
        backImageView.setPickOnBounds(true);
        backImageView.setPreserveRatio(true);
        backImageView.setImage(new Image(getClass().getResourceAsStream("/images/left-arrow.png")));
        backImageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
              controller.openLoginScreen();
            }
        });

        AnchorPane.setLeftAnchor(label, 80.0);
        AnchorPane.setTopAnchor(label, 178.0);
        label.setLayoutX(80.0);
        label.setLayoutY(178.0);
        label.setPrefHeight(171.0);
        label.setPrefWidth(319.0);
        label.setText("You are Playing With Very Smart Computer Try To Beat him");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#eecf56"));
        label.setWrapText(true);
        label.setFont(new Font(24.0));

        hBox.getChildren().add(bakgroundImageView);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(imageView);
        gridPane.getChildren().add(imageView0);
        gridPane.getChildren().add(imageView1);
        gridPane.getChildren().add(imageView2);
        gridPane.getChildren().add(imageView3);
        gridPane.getChildren().add(imageView4);
        gridPane.getChildren().add(imageView5);
        gridPane.getChildren().add(imageView6);
        gridPane.getChildren().add(imageView7);
        hBox.getChildren().add(gridPane);
        getChildren().add(hBox);
        hBox0.getChildren().add(backImageView);
        getChildren().add(hBox0);
        getChildren().add(label);

    }

    protected void setXO(javafx.scene.input.MouseEvent event) {
        if (getRowIndex((ImageView) event.getSource()) == null) {
            rowIndex = 0;
        } else {
            rowIndex = getRowIndex((ImageView) event.getSource());
        }
        if (getColumnIndex((ImageView) event.getSource()) == null) {
            columnIndex = 0;
        } else {
            columnIndex = getColumnIndex((ImageView) event.getSource());
        }

        if (x_Trun) {
            if (cell[rowIndex][columnIndex] == '\0') {
                ((ImageView) event.getSource()).setImage(new Image(getClass().getResource("/images/x.png").toExternalForm()));
                cell[rowIndex][columnIndex] = 'x';
                x_Trun = false;
                cellFallCounter++;

                if (checkWin(cell, 'x')) {
                    controller.alertWinner();
                } else {
                    computerTurn(cell);
                }
            }
        }

        if (cellFallCounter == 9 && !(checkWin(cell, 'x') || checkWin(cell, 'o'))) {
            controller.alertDrawen();
        }
    }
    public void computerTurn(char cell[][]) {
        //int randomFirstCell = random.nextInt(4) + 1;

        switch (movesCounter) {
            case 1:
                System.out.println("Move 1");
                // if (randomFirstCell == 1) {
                if (cell[1][1] == '\0') {
                    imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
                    x_Trun = true;
                    firstMove = "11";
                    cell[1][1] = 'o';

                    //}
                } else if (cell[1][1] == 'x') {
                    imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
                    x_Trun = true;
                    firstMove = "02";
                    cell[0][2] = 'o';

                }
                isEnd = checkWin(cell, 'o');

                //  isEnd = checkWin(cell, 'x');
                if (checkWin(cell, 'o')) {
                    controller.alertLosser();

                }
                break;
            case 2:
                System.out.println("move 2");
                caseTwo();
                break;
            default:
                if (!isEnd) {

                    int second[] = checkBesideSymbol('o');
                    if (second[0] != 5) {
                        System.out.println("counter >= 3 ");
                        cell[second[0]][second[1]] = 'o';
                        x_Trun = true;

                    } else {
                        int secondMy[] = checkBesideSymbol('x');
                        if (secondMy[0] != 5) {
                            cell[secondMy[0]][secondMy[1]] = 'o';
                            x_Trun = true;
                        } else {
                            secondMy = noOtherOption();
                            if (secondMy[0] != 5) {
                                System.out.println("" + secondMy[0] + "  " + secondMy[1]);

                                cell[secondMy[0]][secondMy[1]] = 'o';
                                if (secondMy[0] == 2 && secondMy[1] == 0) {
                                    imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
                                } else if (secondMy[0] == 0 && secondMy[1] == 0) {
                                    imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 0 && secondMy[1] == 1) {
                                    imageView0.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 0 && secondMy[1] == 2) {
                                    imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 1 && secondMy[1] == 0) {
                                    imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 1 && secondMy[1] == 1) {
                                    imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 1 && secondMy[1] == 2) {
                                    imageView4.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 2 && secondMy[1] == 1) {
                                    imageView6.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                } else if (secondMy[0] == 2 && secondMy[1] == 2) {
                                    imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

                                }
                                x_Trun = true;

                            }
                        }
                    }
                }
                isEnd = checkWin(cell, 'o');
                // isEnd = checkWin(cell, 'x');
                if (checkWin(cell, 'o')) {
                    controller.alertLosser();

                }
                break;
        }
        cellFallCounter++;
        movesCounter++;

    }

    // sign is X or O
    boolean checkWin(char cell[][], char sign) {
        //check if sign fill the first row
        //[0][0] [0][1] [0][2]

        if (((cell[0][0] == sign) && (cell[0][1] == sign) && (cell[0][2] == sign))) {
            System.out.println(sign + "  WIN");
            return true;
            //check if sign fill the second row
            //[1][0] [1][1] [1][2]
        } else if (((cell[1][0] == sign) && (cell[1][1] == sign) && (cell[1][2] == sign))) {
            System.out.println(sign + "  WIN");
            return true;
            //check if sign fill the third row
            //[2][0] [2][1] [2][2]
        } else if (((cell[2][0] == sign) && (cell[2][1] == sign) && (cell[2][2] == sign))) {
            System.out.println(sign + "  WIN");
            return true;

            //check if sign fill the first column
            //[0][0] [1][0] [2][0]
        } else if (((cell[0][0] == sign) && (cell[1][0] == sign) && (cell[2][0] == sign))) {
            System.out.println(sign + "  WIN");
            return true;

            //check if sign fill the second column
            //[0][1] [1][1] [2][1]
        } else if (((cell[0][1] == sign) && (cell[1][1] == sign) && (cell[2][1] == sign))) {
            System.out.println(sign + "  WIN");
            return true;

            //check if sign fill the third column
            //[0][2] [1][2] [2][2]
        } else if (((cell[0][2] == sign) && (cell[1][2] == sign) && (cell[2][2] == sign))) {
            System.out.println(sign + "  WIN");
            return true;

            //check if sign fill the first diagonal
            //[0][0] [0][1] [0][2]
        } else if (((cell[0][0] == sign) && (cell[1][1] == sign) && (cell[2][2] == sign))) {
            System.out.println(sign + "  WIN");
            return true;

            //check if sign fill the second diagonal
            //[0][2] [1][1] [2][0]
        } else if (((cell[0][2] == sign) && (cell[1][1] == sign) && (cell[2][0] == sign))) {
            System.out.println(sign + "  WIN");
            return true;

        }
        return false;
    }

    void caseTwo() {
        if (cell[0][0] == 'x' && cell[0][1] == 'x' && cell[0][2] == '\0') {
            x_Trun = true;
            cell[0][2] = 'o';
            imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][0] == 'x' && cell[1][0] == 'x' && cell[2][0] == '\0') {
            x_Trun = true;
            cell[2][0] = 'o';
            imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][0] == 'x' && cell[1][1] == 'x' && cell[2][2] == '\0') {
            //ممكن نشيلها
            x_Trun = true;
            cell[2][2] = 'o';
            imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][1] == 'x' && cell[0][2] == 'x' && cell[0][0] == '\0') {
            x_Trun = true;
            cell[0][0] = 'o';
            imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][1] == 'x' && cell[1][1] == 'x' && cell[2][1] == '\0') {
            x_Trun = true;
            cell[2][1] = 'o';
            imageView6.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][2] == 'x' && cell[1][1] == 'x' && cell[2][0] == '\0') {
            x_Trun = true;
            cell[2][0] = 'o';
            imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][2] == 'x' && cell[1][2] == 'x' && cell[2][2] == '\0') {
            x_Trun = true;
            cell[2][2] = 'o';
            imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[1][0] == 'x' && cell[1][1] == 'x' && cell[1][2] == '\0') {
            x_Trun = true;
            cell[1][2] = 'o';
            imageView4.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[1][0] == 'x' && cell[2][0] == 'x' && cell[0][0] == '\0') {
            x_Trun = true;
            cell[0][0] = 'o';
            imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[2][0] == 'x' && cell[1][1] == 'x' && cell[0][2] == '\0') {
            //ممكن تشيلها
            x_Trun = true;
            cell[0][2] = 'o';
            imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[2][1] == 'x' && cell[1][1] == 'x' && cell[0][1] == '\0') {
            //ممكن تشيلها

            x_Trun = true;
            cell[0][1] = 'o';
            imageView0.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[2][2] == 'x' && cell[1][1] == 'x' && cell[0][0] == '\0') {
            //ممكن تشيلها

            x_Trun = true;
            cell[0][0] = 'o';
            imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[1][1] == 'x' && cell[1][2] == 'x' && cell[1][0] == '\0') {
            x_Trun = true;
            cell[1][0] = 'o';
            imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[1][2] == 'x' && cell[1][1] == 'x' && cell[1][0] == '\0') {
            //ممكن تشيلها

            x_Trun = true;
            cell[1][0] = 'o';
            imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][2] == 'x' && cell[1][2] == 'x' && cell[0][2] == '\0') {
            x_Trun = true;
            cell[0][2] = 'o';
            imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[2][0] == 'x' && cell[2][1] == 'x' && cell[2][2] == '\0') {
            x_Trun = true;
            cell[2][2] = 'o';
            imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[2][1] == 'x' && cell[2][2] == 'x' && cell[2][0] == '\0') {
            x_Trun = true;
            cell[2][0] = 'o';
            imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][0] == 'x' && cell[0][2] == 'x' && cell[0][1] == '\0') {
            x_Trun = true;
            cell[0][1] = 'o';
            imageView0.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][0] == 'x' && cell[2][0] == 'x' && cell[1][0] == '\0') {
            x_Trun = true;
            cell[1][0] = 'o';
            imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][2] == 'x' && cell[2][2] == 'x' && cell[1][2] == '\0') {
            x_Trun = true;
            cell[1][2] = 'o';
            imageView4.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[2][0] == 'x' && cell[2][2] == 'x' && cell[2][1] == '\0') {
            x_Trun = true;
            cell[2][1] = 'o';
            imageView6.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][0] == 'x' && cell[2][2] == 'x' && cell[1][1] == '\0') {
            x_Trun = true;
            cell[1][1] = 'o';
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][2] == 'x' && cell[2][0] == 'x' && cell[1][1] == '\0') {
            x_Trun = true;
            cell[1][1] = 'o';
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][1] == 'x' && cell[2][1] == 'x' && cell[1][1] == '\0') {
            x_Trun = true;
            cell[1][1] = 'o';
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[1][0] == 'x' && cell[1][2] == 'x' && cell[1][1] == '\0') {
            x_Trun = true;
            cell[1][1] = 'o';
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else {
            if (cell[2][2] != '\0') {
                imageView4.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
                cell[1][2] = 'o';
                x_Trun = true;
            } else {
                imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
                cell[2][2] = 'o';
                x_Trun = true;
            }
        }
        isEnd = checkWin(cell, 'o');
        // isEnd = checkWin(cell, 'x');
    }
// / Computer moves

    public int[] checkBesideSymbol(char symbol) {

        int[] ret = new int[2];
        ret[0] = 5;
        if (cell[0][0] == symbol && cell[0][1] == symbol && cell[0][2] == '\0') {
            ret[0] = 0;
            ret[1] = 2;
            imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));
        } else if (cell[0][0] == symbol && cell[1][0] == symbol && cell[2][0] == '\0') {
            ret[0] = 2;
            ret[1] = 0;
            imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][0] == symbol && cell[1][1] == symbol && cell[2][2] == '\0') {
            ret[0] = 2;
            ret[1] = 2;
            imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][1] == symbol && cell[0][2] == symbol && cell[0][0] == '\0') {
            ret[0] = 0;
            ret[1] = 0;
            imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][1] == symbol && cell[1][1] == symbol && cell[2][1] == '\0') {
            ret[0] = 2;
            ret[1] = 1;
            imageView6.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][2] == symbol && cell[1][1] == symbol && cell[2][0] == '\0') {
            ret[0] = 2;
            ret[1] = 0;
            imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][2] == symbol && cell[1][2] == symbol && cell[2][2] == '\0') {
            ret[0] = 2;
            ret[1] = 2;
            imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[1][0] == symbol && cell[1][1] == symbol && cell[1][2] == '\0') {
            ret[0] = 1;
            ret[1] = 2;
            imageView4.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[1][0] == symbol && cell[2][0] == symbol && cell[0][0] == '\0') {
            ret[0] = 0;
            ret[1] = 0;
            imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][0] == symbol && cell[1][1] == symbol && cell[0][2] == '\0') {
            ret[0] = 0;
            ret[1] = 2;
            imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][1] == symbol && cell[1][1] == symbol && cell[0][1] == '\0') {
            ret[0] = 0;
            ret[1] = 1;
            imageView0.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][2] == symbol && cell[1][1] == symbol && cell[0][0] == '\0') {
            ret[0] = 0;
            ret[1] = 0;
            imageView.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[1][1] == symbol && cell[1][2] == symbol && cell[1][0] == '\0') {
            ret[0] = 1;
            ret[1] = 0;
            imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[1][2] == symbol && cell[1][1] == symbol && cell[1][0] == '\0') {
            ret[0] = 1;
            ret[1] = 0;
            imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][2] == symbol && cell[1][2] == symbol && cell[0][2] == '\0') {
            ret[0] = 0;
            ret[1] = 2;
            imageView1.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][0] == symbol && cell[2][1] == symbol && cell[2][2] == '\0') {
            ret[0] = 2;
            ret[1] = 2;
            imageView7.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][1] == symbol && cell[2][2] == symbol && cell[2][0] == '\0') {
            ret[0] = 2;
            ret[1] = 0;
            imageView5.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][0] == symbol && cell[0][2] == symbol && cell[0][1] == '\0') {
            ret[0] = 0;
            ret[1] = 1;
            imageView0.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][0] == symbol && cell[2][0] == symbol && cell[1][0] == '\0') {
            ret[0] = 1;
            ret[1] = 0;
            imageView2.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][2] == symbol && cell[2][2] == symbol && cell[1][2] == '\0') {
            ret[0] = 1;
            ret[1] = 2;
            imageView4.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[2][0] == symbol && cell[2][2] == symbol && cell[2][1] == '\0') {
            ret[0] = 2;
            ret[1] = 1;
            imageView6.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][0] == symbol && cell[2][2] == symbol && cell[1][1] == '\0') {
            ret[0] = 1;
            ret[1] = 1;
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][2] == symbol && cell[2][0] == symbol && cell[1][1] == '\0') {
            ret[0] = 1;
            ret[1] = 1;
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[0][1] == symbol && cell[2][1] == symbol && cell[1][1] == '\0') {
            ret[0] = 1;
            ret[1] = 1;
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        } else if (cell[1][0] == symbol && cell[1][2] == symbol && cell[1][1] == '\0') {
            ret[0] = 1;
            ret[1] = 1;
            imageView3.setImage(new Image(getClass().getResource("/images/o.png").toExternalForm()));

        }
        return ret;

    }

    public int[] noOtherOption() {
        int[] ret = new int[2];
        ret[0] = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cell[i][j] == '\0') {
                    ret[0] = i;
                    ret[1] = j;
                    break;
                }
            }
            if (ret[0] != 5) {
                break;
            }
            System.out.println("noOtherOption");
        }

        return ret;
    }
}
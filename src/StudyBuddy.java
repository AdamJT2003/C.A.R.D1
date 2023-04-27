/*Team Name: C.A.R.D
Members = Caitlin, David, Adam T, Ryan, Connor
Name of app = StudyBuddy
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class StudyBuddy {
    private JPanel Background;
    private JPanel Welcome;
    private JButton continueBtn;
    private JTextPane welcomeTxtPane;
    private JPanel Name;
    private JButton backBtnName;
    private JButton NextBtnName;
    private JLabel nameLbl;
    private JTextField forenameTxtField;
    private JTextField surnameTxtField;
    private JPanel DigitalSkillsSoftwareDev;
    private JLabel DigitalSkillsSoftwareLbl;
    private JLabel DigitalSkillsSoftwarePracticalLbl;
    private JButton NextBtnDigSkillsSoftware;
    private JButton backBtnDigSkillsSoftware;
    private JPanel DigitalSkillsCyber;
    private JComboBox DigSkillsSoftwareDevTheory;
    private JComboBox DigSkillsSoftwareDevPrac;
    private JComboBox DigSkillsCyberGrade;
    private JButton BackBtnCyber;
    private JButton NextBtnCyber;
    private JPanel DigSkillsDataScience;
    private JComboBox DigSkillsDataGrade;
    private JLabel DigSkillsDataLbl;
    private JPanel IoT;
    private JPanel NetworkInfrastructure;
    private JPanel ComputerScience;
    private JPanel CloudComputing;
    private JPanel SoftwareDevelopment;
    private JPanel ProfessionalPractice;
    private JPanel Summary;
    private JComboBox compSciGrade;
    private JButton compSciNextButton;
    private JButton compSciBackButton;
    private JComboBox networkTheory;
    private JComboBox networkPractical;
    private JButton networkNextButton;
    private JButton networkBackButton;
    private JButton BackBtnData;
    private JButton NextBtnData;
    private JButton backButtonIoT;
    private JButton nextButtonIoT;
    private JComboBox iotPracticalGrade;
    private JComboBox iotTheoryGrade;
    private JLabel iotPracticalLabel;
    private JLabel iotTheoryLabel;
    private JComboBox SoftDevTheoryGrade;
    private JComboBox SoftDevPracticalGrade;
    private JButton BackBtnSoftDev;
    private JButton NextBtnSoftDev;
    private JComboBox CloudCompTheoryGrade;
    private JButton NextBtnCloud;
    private JButton BackBtnCloud;
    private JButton BackBtnProfPractice;
    private JButton NextBtnProfPractice;
    private JTextPane WelcomeTxtPane;
    private JButton confirmBtnName;
    private JLabel fullNameLbl;
    private JLabel totalDigSkillsSoftware;
    private JLabel DigSkillsSoftwareDevScoreLbl;
    private JButton confirmBtn;
    private JButton confirmBtnDSCS;
    private JLabel dscsLbl;
    private JButton confirmBtnDigSkillsSoftware;
    private JComboBox ProPractGrade;
    private JButton backBtnSummary;
    private JPanel DigitalSkillsComputerScience;
    private JButton nextBtnDigSkillsCompSci;
    private JButton backBtnDigSkillsCompSci;
    private JButton confirmBtnDigSkillsCompSci;
    private JComboBox DigSkillsCompSciGrade;
    private JLabel DigSkillsCompSciLbl;
    private JLabel NetworkLbl;
    private JButton confirmBtnNetworkInfrastructure;
    private JButton confirmBtnDataScience;
    private JButton confirmBtnIoT;
    private JLabel IotLbl;
    private JLabel DataLbl;
    private JButton confirmBtnComputerScience;
    private JButton confirmBtnCloudComputing;
    private JButton confirmBtnProfessionalPractice;
    private JButton confirmBtnSoftwareDevelopment;
    private JLabel compSciLbl;
    private JLabel cloudCompLbl;
    private JLabel softDevLbl;
    private JLabel ProfPracticeLbl;
    private JTextArea SummaryTxtAreaGrades;
    private JTextArea SummaryTxtAreaSubjects;
    private JTextArea SummaryTxtAreaInfo;
    private JButton nextBtnSummary;
    private JPanel Results;
    private JTextArea ResultsTxtAreaInfo;
    private JButton saveBtnResults;
    private JButton backBtnResults;
    private JButton editGradesBtnResults;
    private JTextArea ResultsTxtAreaName;
    private JTextArea ResultsTxtAreaTotal;
    private JTextArea ResultsTxtAreaOnTarget;
    private JTextArea ResultsTxtAreaPassPercentage;
    private JButton RetrybtnProfPrac;
    private JButton SoftDevRetryBtn;
    private JButton RetryCloudBtn;
    private JButton RetryCompScienceBtn;
    private JPanel LogInOrSignUp;
    private JTextPane LogInTxtPane;
    private JButton signUpBtn;
    private JButton logInBtn;
    private JButton BackBtnSignUpOrLogIn;
    private JTextPane LogInOrSignUpTxtPane;
    private JPanel SignUp;
    private JTextField signUpStudentReferenceTxtField;
    private JLabel usernameLbl;
    private JTextField signUpPasswordTxtField;
    private JButton signUpConfirmUsernameAndPassword;
    private JButton backBtnSignUp;
    private JButton nextBtnSignUp;
    private JPanel LogIn;
    private JTextField LogInStudentRefNumberTxtField;
    private JButton confirmBtnLogin;
    private JButton backBtnLogin;
    private JButton NextBtnLogin;
    private JPasswordField passwordJPasswordField;
    private JCheckBox showPasswordLogin;
    private JPanel Profile;
    private JButton profileEditBtn;
    private JButton BackBtnProfile;
    private JButton networkRetryBtn;
    private JTextPane profileTxtPane;
    private JComboBox cloudCompPrac;
    private JTextArea profileWelcomeTxtArea;
    private JTextArea profileSubjectsTxtArea;
    private JTextArea profileGradesTxtArea;
    private JTextArea profileNameTxtArea;
    private JTextArea profileTotalTxtArea;
    private JTextArea profileOnTargetTxtArea;
    private JTextArea profilePassPercentageTxtArea;
    private JButton profileQuizBtn;
    private JButton profileSignOut;
    private JButton quizBtnResults;
    private JButton signOutBtnResults;
    private JPanel quizSelection;
    private JButton backBtnQuizSelection;
    private JComboBox quizSelector;
    private JButton nextBtnQuizSelection;
    private JPanel DigSkillsSoftDevQuestion1;
    private JPanel DigSkillsCyberSecQuestion1;
    private JPanel DigSkillsCyberSecQuestion2;
    private JPanel DigSkillsCyberSecQuestion3;
    private JPanel DigSkillsCyberSecQuestion4;
    private JPanel DigSkillsSoftDevQuiz;
    private JPanel DigSkillsCyberSecQuestion5;
    private JPanel DigSkillsCyberSecQuestion6;
    private JPanel DigSkillsCyberSecQuiz;
    private JPanel DigSkillsSoftDevQuizWelcome;
    private JButton DigSkillsSoftDevQuizStartBtn;
    private JButton DigSkillsSoftDevQuizBackBtn;
    private JPanel DigSkillsCyberSecQuizStart;
    private JButton DigSkillsCyberSecQuizBackBtn;
    private JButton DigSkillsCyberSecQuizStartBtn;
    private JButton IotRetryBtn;
    private JButton DigSkillDataSciRetry;
    private JButton DigSkillComSciRetry;
    private JButton DigSkillCybSecRetry;
    private JButton DigSkilSoftDev;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ1;
    private JButton confirmAnsBtnsDigSkillsSoftDevQ1;
    private JButton nextQBtnDigSkillsSoftDevQ1;
    private JPanel DigSkillsSoftDevQuestion2;
    private JPanel DigSkillsSoftDevQuestion3;
    private JPanel DigSkillsSoftDevQuestion4;
    private JPanel DigSkillsSoftDevQuestion5;
    private JPanel DigSkillsSoftDevQuestion6;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ1;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ1;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ1;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ2;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ3;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ3;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ3;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ3;
    private JButton confirmAnsBtnDigSkillsSoftDevQ3;
    private JButton nextQBtnDigSkillsSoftDevQ3;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ4;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ4;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ4;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ4;
    private JButton confirmAnsBtnDigSkillsSoftDevQ4;
    private JButton nextQBtnDigSkillsSoftDevQ4;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ5;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ5;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ5;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ5;
    private JButton confirmAnsBtnDigSkillsSoftDevQ5;
    private JRadioButton ansARadioBtnDigSkillsSoftDevQ6;
    private JRadioButton ansBRadioBtnDigSkillsSoftDevQ6;
    private JRadioButton ansCRadioBtnDigSkillsSoftDevQ6;
    private JRadioButton ansDRadioBtnDigSkillsSoftDevQ6;
    private JButton nextQBtnDigSkillsSoftDevQ6;
    private JButton confirmAnsBtnDigSkillsSoftDevQ6;
    private JButton confirmAnsBtnDigSkillsSoftDevQ2;
    private JLabel ansALblDigSkillsSoftDevQ1;
    private JLabel ansBLblDigSkillsSoftDevQ1;
    private JLabel ansCLblDigSkillsSoftDevQ1;
    private JLabel ansDLblDigSkillsSoftDevQ1;
    private JButton nextQBtnDigSkillsSoftDevQ2;
    private JTextPane correctAnsDigSkillsSoftDevQ3TxtPane;
    private JTextPane correctAnsDigSkillsSoftDevQ2TxtPane;
    private JTextPane correctAnsDigSkillsSoftDevQ1TxtPane;
    private JButton nextQBtnDigSkillsSoftDevQ5;
    private JTextPane correctAnsDigSkillsSoftDevQ4TxtPane;
    private JTextPane correctAnsDigSkillsSoftDevQ5TxtPane;
    private JTextPane correctAnsDigSkillsSoftDevQ6TxtPane;
    private JLabel ansBLblDigSkillsSoftDevQ2;
    private JLabel ansALblDigSkillsSoftDevQ3;
    private JLabel ansBLblDigSkillsSoftDevQ3;
    private JLabel ansCLblDigSkillsSoftDevQ3;
    private JButton confirmPasswordBtn;
    public String surname;
    public String forename;
    public int total;

    public String fullName;
    public String[] onTarget = {null, "Yes", "No"};
    public int index;

    double passPercentage;
    double roundOffPassPercentage;

    public int percentagePass;
    public int quizTotal;

    /*
    main method
    displays the frame with name of Study Buddy
    sets background for Study Buddy//
    sets exit on close
    packs frames
    sets frame to visible
     */
    public static void main(String[] args) {
        // create new jFrame
        JFrame frame = new JFrame("Study Buddy");
        // set the jFrame to contain the GUI
        frame.setContentPane(new StudyBuddy().Background);
        // set exit on close, pack components and make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    //Welcome Page
    // action listener for continue button, takes user to LogInOrSignUp panel
    public StudyBuddy() {
        //Takes the user onto the Age page when clicked
        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // removes previous panel, adds LogInOrSignUp panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(LogInOrSignUp);
                Background.repaint();
                Background.revalidate();

                //Disables next buttons
                NextBtnName.setEnabled(false);
                NextBtnDigSkillsSoftware.setEnabled(false);
                nextBtnDigSkillsCompSci.setEnabled(false);
                NextBtnCyber.setEnabled(false);
                NextBtnData.setEnabled(false);
                nextButtonIoT.setEnabled(false);
                networkNextButton.setEnabled(false);
                compSciNextButton.setEnabled(false);
                NextBtnCloud.setEnabled(false);
                NextBtnSoftDev.setEnabled(false);
                NextBtnProfPractice.setEnabled(false);
                NextBtnLogin.setEnabled(false);
            }
        });

        //Login/ Sign-up page

        //Back button on the login/sign-up page
        BackBtnSignUpOrLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // removes previous panel, adds Welcome panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });

        //sign-up button on login/sign-up page
        signUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // removes previous panel, adds SignUp panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(SignUp);
                Background.repaint();
                Background.revalidate();
                nextBtnSignUp.setEnabled(false);
            }
        });

        //login button on login/sign-up page
        logInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // removes previous panel, adds LogIn panel, repaints and revalidates panels
                Background.removeAll();
                Background.add(LogIn);
                Background.repaint();
                Background.revalidate();
            }
        });

        //Sign up page
        signUpConfirmUsernameAndPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Initialises fileUsernames
                File fileUsernames = new File("users.txt");

                //Checks to see if the sign-up text fields are empty and throws a warning message
                if (signUpStudentReferenceTxtField.getText().isEmpty() || signUpPasswordTxtField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a username and password.");


                }
                //If both text fields are filled in, this will write the student reference number and password to users.txt
                else {
                    try {
                        FileOutputStream fOut = new FileOutputStream(fileUsernames, true);
                        OutputStreamWriter osw = new OutputStreamWriter(fOut);
                        osw.write(signUpStudentReferenceTxtField.getText() + "," + signUpPasswordTxtField.getText());
                        osw.write("\n");
                        osw.flush();
                        osw.close();
                    }
                    //Throws an exception if users.txt cannot be found
                    catch (Exception e2) {

                    }

                    //Enables nextBtnSignUp
                    nextBtnSignUp.setEnabled(true);

                    //initalises writer
                    Writer writer = null;

                    //creates a new file using the student reference number when both the student refere
                    try {
                        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(signUpStudentReferenceTxtField.getText() + ".txt"), "utf-8"));
                    } catch (IOException ex) {

                    } finally {
                        try {
                            writer.close();
                        } catch (Exception ex) {
                        }
                    }

                    File fileUserRefNo = new File("usersRefNo.txt");
                    try {
                        FileOutputStream fOut = new FileOutputStream(fileUserRefNo, true);
                        OutputStreamWriter osw = new OutputStreamWriter(fOut);
                        osw.write(signUpStudentReferenceTxtField.getText());
                        osw.write(",");
                        osw.flush();
                        osw.close();
                    } catch (Exception e2) {
                    }

                }
            }
        });

        backBtnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(LogInOrSignUp);
                Background.repaint();
                Background.revalidate();
            }
        });
        nextBtnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Name);
                Background.repaint();
                Background.revalidate();
            }
        });
        backBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(LogInOrSignUp);
                Background.repaint();
                Background.revalidate();
            }
        });
        confirmBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == confirmBtnLogin) {
                    String username = LogInStudentRefNumberTxtField.getText();
                    String password = String.valueOf(passwordJPasswordField.getPassword());
                    try {
                        File file = new File("users.txt");
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            String[] parts = line.split(",");
                            if (username.equals(parts[0]) && password.equals(parts[1])) {
                                JOptionPane.showMessageDialog(null, "Login Successful");
                                NextBtnLogin.setEnabled(true);

                                try {
                                    FileReader reader = new FileReader(LogInStudentRefNumberTxtField.getText() + ".txt");
                                    BufferedReader br = new BufferedReader(reader);
                                    String lineRead = br.readLine();
                                    String[] partsRead = lineRead.split(", ");


                                    fullName = partsRead[0];
                                    DigSkillsSoftwareDevTheory.setSelectedItem(partsRead[1]);
                                    DigSkillsSoftwareDevPrac.setSelectedItem(partsRead[2]);
                                    DigSkillsCyberGrade.setSelectedItem(partsRead[3]);
                                    DigSkillsCompSciGrade.setSelectedItem(partsRead[4]);
                                    DigSkillsDataGrade.setSelectedItem(partsRead[5]);
                                    iotTheoryGrade.setSelectedItem(partsRead[6]);
                                    iotPracticalGrade.setSelectedItem(partsRead[7]);
                                    networkTheory.setSelectedItem(partsRead[8]);
                                    networkPractical.setSelectedItem(partsRead[9]);
                                    compSciGrade.setSelectedItem(partsRead[10]);
                                    CloudCompTheoryGrade.setSelectedItem(partsRead[11]);
                                    cloudCompPrac.setSelectedItem(partsRead[12]);
                                    SoftDevTheoryGrade.setSelectedItem(partsRead[13]);
                                    SoftDevPracticalGrade.setSelectedItem(partsRead[14]);
                                    ProPractGrade.setSelectedItem(partsRead[15]);
                                    total = Integer.parseInt(partsRead[16]);
                                    index = Integer.parseInt(partsRead[17]);
                                    percentagePass = Integer.parseInt(partsRead[18]);


                                    br.close();
                                    profileWelcomeTxtArea.setText("Welcome back " + fullName + "! You can check your grades and edit them if required. \nAfterwards you will be able to gain some practice through our revision quizzes. \nYour grades are shown below:");


                                    profileSubjectsTxtArea.setText("\nDigital Skills: Software Development Theory");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Software Development Practical");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Cyber Security");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Computer Science");
                                    profileSubjectsTxtArea.append("\nDigital Skills: Data Science");
                                    profileSubjectsTxtArea.append("\nInternet of Things Theory");
                                    profileSubjectsTxtArea.append("\nInternet of Things Practical");
                                    profileSubjectsTxtArea.append("\nNetwork Infrastructure Theory");
                                    profileSubjectsTxtArea.append("\nNetwork Infrastructure Practical");
                                    profileSubjectsTxtArea.append("\nComputer Science");
                                    profileSubjectsTxtArea.append("\nCloud Computing Theory");
                                    profileSubjectsTxtArea.append("\nCloud Computing Practical");
                                    profileSubjectsTxtArea.append("\nSoftware Development Theory");
                                    profileSubjectsTxtArea.append("\nSoftware Development Practical");
                                    profileSubjectsTxtArea.append("\nProfessional Practice");


                                    profileGradesTxtArea.setText("\n   -   " + DigSkillsSoftwareDevTheory.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsSoftwareDevPrac.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsCyberGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsCompSciGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + DigSkillsDataGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + iotTheoryGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + iotPracticalGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + networkTheory.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + networkPractical.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + compSciGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + CloudCompTheoryGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + cloudCompPrac.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + SoftDevTheoryGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + SoftDevPracticalGrade.getSelectedItem());
                                    profileGradesTxtArea.append("\n   -   " + ProPractGrade.getSelectedItem());


                                    profileNameTxtArea.setText("Name\n" + fullName);
                                    profileTotalTxtArea.setText("Total\n" + total);
                                    profileOnTargetTxtArea.setText("On Target\n" + onTarget[index]);
                                    profilePassPercentageTxtArea.setText("Pass Percentage\n" + percentagePass + "%");

                                } catch (Exception e2) {
                                    System.out.println(e2);


                                }
                                return;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "File not found.");
                    }
                }
            }


        });
        showPasswordLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordLogin.isSelected()) {
                    passwordJPasswordField.setEchoChar((char) 0);
                } else {
                    passwordJPasswordField.setEchoChar('*');
                }
            }
        });
        NextBtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Profile);
                Background.repaint();
                Background.revalidate();
            }
        });


        profileEditBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

                total = 0;

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

            }
        });
        BackBtnProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(LogIn);
                Background.repaint();
                Background.revalidate();
            }
        });
        profileSignOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Clearing all text areas after sign out.
                signUpStudentReferenceTxtField.setText("");
                LogInStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordField.setText("");
                forenameTxtField.setText("");
                surnameTxtField.setText("");
                fullNameLbl.setText("");
                profileWelcomeTxtArea.setText("");
                profileSubjectsTxtArea.setText("");
                profileGradesTxtArea.setText("");
                profileNameTxtArea.setText("");
                profileTotalTxtArea.setText("");
                profileOnTargetTxtArea.setText("");
                profilePassPercentageTxtArea.setText("");
                ResultsTxtAreaInfo.setText("");
                ResultsTxtAreaName.setText("");
                ResultsTxtAreaTotal.setText("");
                ResultsTxtAreaOnTarget.setText("");
                ResultsTxtAreaPassPercentage.setText("");
                SummaryTxtAreaSubjects.setText("");
                SummaryTxtAreaGrades.setText("");

                //Setting grades to default.
                DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                DigSkillsDataGrade.setSelectedItem("Select Grade.");
                iotTheoryGrade.setSelectedItem("Select Grade.");
                iotPracticalGrade.setSelectedItem("Select Grade.");
                networkTheory.setSelectedItem("Select Grade.");
                networkPractical.setSelectedItem("Select Grade.");
                compSciGrade.setSelectedItem("Select Grade.");
                CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                cloudCompPrac.setSelectedItem("Select Grade.");
                SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                ProPractGrade.setSelectedItem("Select Grade.");

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });

        profileQuizBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(quizSelection);
                Background.repaint();
                Background.revalidate();
            }
        });


        //Confirms and displays the users full name.
        confirmBtnName.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //Asks the user to input forename
                forename = forenameTxtField.getText();
                //Asks the user to input surname
                surname = surnameTxtField.getText();
                fullName = (forename + " " + surname);

                //Puts the full name together and displays it on the full name label
                fullNameLbl.setText(fullName);
                NextBtnName.setEnabled(true);

                DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                DigSkillsDataGrade.setSelectedItem("Select Grade.");
                iotTheoryGrade.setSelectedItem("Select Grade.");
                iotPracticalGrade.setSelectedItem("Select Grade.");
                networkTheory.setSelectedItem("Select Grade.");
                networkPractical.setSelectedItem("Select Grade.");
                compSciGrade.setSelectedItem("Select Grade.");
                CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                cloudCompPrac.setSelectedItem("Select Grade.");
                SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                ProPractGrade.setSelectedItem("Select Grade.");

                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Select Grade." || DigSkillsSoftwareDevPrac.getSelectedItem() == "Select Grade." || DigSkillsCyberGrade.getSelectedItem() == "Select Grade." || DigSkillsCompSciGrade.getSelectedItem() == "Select Grade." || DigSkillsDataGrade.getSelectedItem() == "Select Grade." || iotTheoryGrade.getSelectedItem() == "Select Grade." || iotPracticalGrade.getSelectedItem() == "Select Grade." || networkTheory.getSelectedItem() == "Select Grade." || networkPractical.getSelectedItem() == "Select Grade." || compSciGrade.getSelectedItem() == "Select Grade." || CloudCompTheoryGrade.getSelectedItem() == "Select Grade." || cloudCompPrac.getSelectedItem() == "Select Grade." || SoftDevTheoryGrade.getSelectedItem() == "Select Grade." || SoftDevPracticalGrade.getSelectedItem() == "Select Grade." || ProPractGrade.getSelectedItem() == "Select Grade.") {
                    index = 0;
                    total = 0;
                    percentagePass = 0;
                }


                File fileNames = new File(signUpStudentReferenceTxtField.getText() + ".txt");
                try {
                    FileOutputStream fOut = new FileOutputStream(fileNames, true);
                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                    osw.write(fullName + ", " + DigSkillsSoftwareDevTheory.getSelectedItem() + ", " + DigSkillsSoftwareDevPrac.getSelectedItem() + ", " + DigSkillsCyberGrade.getSelectedItem() + ", " + DigSkillsCompSciGrade.getSelectedItem() + ", " + DigSkillsDataGrade.getSelectedItem() + ", " + iotTheoryGrade.getSelectedItem() + ", " + iotPracticalGrade.getSelectedItem() + ", " + networkTheory.getSelectedItem() + ", " + networkPractical.getSelectedItem() + ", " + compSciGrade.getSelectedItem() + ", " + CloudCompTheoryGrade.getSelectedItem() + ", " + cloudCompPrac.getSelectedItem() + ", " + SoftDevTheoryGrade.getSelectedItem() + ", " + SoftDevPracticalGrade.getSelectedItem() + ", " + ProPractGrade.getSelectedItem() + ", " + total + ", " + index + ", " + percentagePass + ", ");
                    osw.flush();
                    osw.close();
                } catch (Exception e2) {

                }


            }
        });


        // action listener for back button, takes user back to Welcome panel
        backBtnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(LogIn);
                Background.repaint();
                Background.revalidate();
            }
        });


        // next button to digital skills soft dev panel
        NextBtnName.addActionListener(new

                                              ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {
                                                      Background.removeAll();
                                                      Background.add(LogIn);
                                                      Background.repaint();
                                                      Background.revalidate();
                                                  }
                                              });


        // back button to Name panel
        backBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Profile);
                Background.repaint();
                Background.revalidate();

            }
        });


        //Confirms the users input, finds which number the input would equal and adds it to a total
        confirmBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigSkilSoftDev.setEnabled(true);
                NextBtnDigSkillsSoftware.setEnabled(true);
                DigSkillsSoftwareDevTheory.setEnabled(false);
                confirmBtnDigSkillsSoftware.setEnabled(false);
                DigSkillsSoftwareDevPrac.setEnabled(false);
                //Initialise DigSkillsSoftwareDevScore as an integer with value 0
                int DigSkillsSoftwareDevScore = 0;

                /*Checks to see if the Digital Skills: Software Development Theory grade = "Pass."
                 Adds 3 to total if Digital Skills: Software Development Theory grade = "Pass."
                 */
                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Pass.") {
                    DigSkillsSoftwareDevScore += 3;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 1)"
                 Adds 2 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsSoftwareDevScore += 2;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 2)"
                 Adds 1 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsSoftwareDevScore += 1;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 3)"
                 Adds 0 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsSoftwareDevScore += 0;
                }

                /*Checks to see if the Digital Skills: Software Development Practical grade = "Pass."
                 Adds 3 to total if Digital Skills: Software Development Practical grade = "Pass."
                 */
                if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Pass.") {
                    DigSkillsSoftwareDevScore += 3;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 1)"
                 Adds 2 to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsSoftwareDevScore += 2;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 Adds 1 to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsSoftwareDevScore += 1;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 Adds 0 to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsSoftwareDevScore += 0;
                }

                //Updates total and displays Digital Skills: Software Development total
                total = total + DigSkillsSoftwareDevScore;
                DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(DigSkillsSoftwareDevScore));
                NextBtnDigSkillsSoftware.setEnabled(true);


            }

        });


        // next button to digital skills cyber
        NextBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsCyber);
                Background.repaint();
                Background.revalidate();

            }
        });


        // back button to software dev
        BackBtnCyber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

                /*Checks to see if the Digital Skills: Software Development Theory grade = "Pass."
                 Subtracts 3 to total if Digital Skills: Software Development Theory grade = "Pass."
                 */

            }
        });


        //Confirms the users input, finds which number the input would equal and adds it to a total
        confirmBtnDSCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DigSkillCybSecRetry.setEnabled(true);
                DigSkillsCyberGrade.setEnabled(false);
                NextBtnCyber.setEnabled(true);
                confirmBtnDSCS.setEnabled(false);

                int DigSkillsCyberSecure = 0;

                /*Checks to see if the Digital Skills: Cyber Security grade = "Pass."
                 Adds 3  to total if Digital Skills: Cyber Security grade = "Pass."
                 */
                if (DigSkillsCyberGrade.getSelectedItem() == "Pass.") {
                    DigSkillsCyberSecure += 3;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 Adds 2  to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsCyberSecure += 2;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 Adds 1 to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsCyberSecure += 1;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 3)"
                 Adds 0  to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCyberSecure += 0;
                }

                //Updates total and displays Digital Skills: Cyber Security total
                total = total + DigSkillsCyberSecure;
                dscsLbl.setText(String.valueOf(DigSkillsCyberSecure));
                NextBtnCyber.setEnabled(true);

            }
        });
        // next button to data sci
        NextBtnCyber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsComputerScience);
                Background.repaint();
                Background.revalidate();

            }
        });


        backBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsCyber);
                Background.repaint();
                Background.revalidate();

                /*Checks to see if the Digital Skills: Cyber Security grade = "Pass."
                 Subtracts 3 to total if Digital Skills: Cyber Security grade = "Pass."
                 */


            }
        });


        confirmBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DigSkillsCompSciGrade.setEnabled(false);
                confirmBtnDigSkillsCompSci.setEnabled(false);
                DigSkillComSciRetry.setEnabled(true);
                nextBtnDigSkillsCompSci.setEnabled(true);

                int DigSkillsCompSci = 0;

                /*Checks to see if the Digital Skills: Computer Science = "Pass."
                 Adds 3  to total if Digital Skills: Computer Science grade = "Pass."
                 */

                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass.") {
                    DigSkillsCompSci += 3;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 1)"
                 Adds 2  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    DigSkillsCompSci += 2;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 2)"
                 Adds 1  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    DigSkillsCompSci += 1;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 3)"
                 Adds 0  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCompSci += 0;
                }

                //Updates total and displays Digital Skills: Computing Science total
                total = total + DigSkillsCompSci;
                DigSkillsCompSciLbl.setText(String.valueOf(DigSkillsCompSci));
                nextBtnDigSkillsCompSci.setEnabled(true);
            }
        });
        nextBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        // back btn to cyber
        BackBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsComputerScience);
                Background.repaint();
                Background.revalidate();


                /*Checks to see if the Digital Skills: Cyber Security = "Pass"
                 Subtracts 3  to total if Digital Skills: Cyber Security grade = "Pass."
                 */


            }
        });

        confirmBtnDataScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DigSkillsDataGrade.setEnabled(false);

                NextBtnData.setEnabled(true);
                confirmBtnDataScience.setEnabled(false);
                DigSkillDataSciRetry.setEnabled(true);


                int total2 = 0;

                if (DigSkillsDataGrade.getSelectedItem() == "Pass.") {
                    total2 = total2 + 3;
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total2 = total2 + 2;
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total2 = total2 + 1;
                }
                DataLbl.setText(String.valueOf(total2));
                total = total + total2;
                NextBtnData.setEnabled(true);
            }
        });

        // next btn to IoT
        NextBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();
            }
        });


        // back btn to data sci
        backButtonIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();

            }
        });


        confirmBtnIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                IotRetryBtn.setEnabled(true);
                nextButtonIoT.setEnabled(true);


                confirmBtnIoT.setEnabled(false);
                iotPracticalGrade.setEnabled(false);
                iotTheoryGrade.setEnabled(false);
                int Total3 = 0;

                if (iotTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                if (iotPracticalGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                IotLbl.setText(String.valueOf(Total3));
                nextButtonIoT.setEnabled(true);
            }
        });


        // next btn to network infra
        nextButtonIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(NetworkInfrastructure);
                Background.repaint();
                Background.revalidate();


            }
        });

        // back btn to IoT
        networkBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();


            }
        });

        confirmBtnNetworkInfrastructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                networkTheory.setEnabled(false);
                networkPractical.setEnabled(false);

                networkNextButton.setEnabled(true);
                confirmBtnNetworkInfrastructure.setEnabled(false);
                networkRetryBtn.setEnabled(true);
                int Total3 = 0;

                if (networkTheory.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                if (networkPractical.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                NetworkLbl.setText(String.valueOf(Total3));

            }
        });
        // next btn to comp sci
        networkNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(ComputerScience);
                Background.repaint();
                Background.revalidate();
            }
        });


        // back btn to network infra
        compSciBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(NetworkInfrastructure);
                Background.repaint();
                Background.revalidate();


            }
        });

        confirmBtnComputerScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                compSciGrade.setEnabled(false);
                confirmBtnComputerScience.setEnabled(false);
                RetryCompScienceBtn.setEnabled(true);


                int Total3 = 0;


                if (compSciGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                total = total + Total3;
                compSciLbl.setText(String.valueOf(Total3));
                compSciNextButton.setEnabled(true);
            }
        });


        // next btn to cloud comp
        compSciNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(CloudComputing);
                Background.repaint();
                Background.revalidate();
            }
        });


        // back btn to comp sci
        BackBtnCloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(ComputerScience);
                Background.repaint();
                Background.revalidate();
            }
        });

        confirmBtnCloudComputing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CloudCompTheoryGrade.setEnabled(false);
                cloudCompPrac.setEnabled(false);

                NextBtnCloud.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(false);
                RetryCloudBtn.setEnabled(true);


                int Total3 = 0;
                if (CloudCompTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                if (cloudCompPrac.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                total = total + Total3;
                cloudCompLbl.setText(String.valueOf(Total3));

            }
        });
        RetryCloudBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CloudCompTheoryGrade.setEnabled(true);
                cloudCompPrac.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);

                RetryCloudBtn.setEnabled(false);
                NextBtnCloud.setEnabled(false);

                if (CloudCompTheoryGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    cloudCompLbl.setText(String.valueOf(0));

                }
                if (cloudCompPrac.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    cloudCompLbl.setText(String.valueOf(0));
                } else if (cloudCompPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    cloudCompLbl.setText(String.valueOf(0));

                }
            }
        });
        // next btn to soft dev
        NextBtnCloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(SoftwareDevelopment);
                Background.repaint();
                Background.revalidate();
            }
        });


        // back btn to cloud comp
        BackBtnSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(CloudComputing);
                Background.repaint();
                Background.revalidate();

            }
        });

        confirmBtnSoftwareDevelopment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SoftDevTheoryGrade.setEnabled(false);
                SoftDevPracticalGrade.setEnabled(false);


                int Total3 = 0;

                if (SoftDevTheoryGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                if (SoftDevPracticalGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                softDevLbl.setText(String.valueOf(Total3));
                NextBtnSoftDev.setEnabled(true);

                confirmBtnSoftwareDevelopment.setEnabled(false);
                SoftDevRetryBtn.setEnabled(true);
                SoftDevTheoryGrade.setEnabled(false);
                SoftDevPracticalGrade.setEnabled(false);


            }
        });

        SoftDevRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                SoftDevRetryBtn.setEnabled(false);
                NextBtnSoftDev.setEnabled(false);

                if (SoftDevPracticalGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    softDevLbl.setText(String.valueOf(0));

                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    softDevLbl.setText(String.valueOf(0));
                }
                if (SoftDevTheoryGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    softDevLbl.setText(String.valueOf(0));
                } else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    total = total - 0;
                    softDevLbl.setText(String.valueOf(0));
                }
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

            }
        });
        // next btn to pro practice
        NextBtnSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(ProfessionalPractice);
                Background.repaint();
                Background.revalidate();

            }
        });

        // back btn to software dev
        BackBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(SoftwareDevelopment);
                Background.repaint();
                Background.revalidate();

            }
        });
        confirmBtnProfessionalPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;

                if (ProPractGrade.getSelectedItem() == "Pass.") {
                    Total3 += 3;

                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    Total3 += 2;

                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    Total3 += 1;

                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                ProfPracticeLbl.setText(String.valueOf(Total3));
                NextBtnProfPractice.setEnabled(true);
                RetrybtnProfPrac.setEnabled(true);


                confirmBtnProfessionalPractice.setEnabled(false);
            }
        });
        RetrybtnProfPrac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmBtnProfessionalPractice.setEnabled(true);
                NextBtnProfPractice.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);

                if (ProPractGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    ProfPracticeLbl.setText(String.valueOf(0));
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    ProfPracticeLbl.setText(String.valueOf(0));
                } else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    ProfPracticeLbl.setText(String.valueOf(0));
                }


            }//
        });
        // next btn to results
        NextBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Summary);
                Background.repaint();
                Background.revalidate();


                String digSkillsSoftwareDevTheoryInput = (String) DigSkillsSoftwareDevTheory.getSelectedItem();
                String digSkillsSoftwareDevPracInput = (String) DigSkillsSoftwareDevPrac.getSelectedItem();
                String digSkillsCyberInput = (String) DigSkillsCyberGrade.getSelectedItem();
                String digSkillsCompSciInput = (String) DigSkillsCompSciGrade.getSelectedItem();
                String digSkillsDataSciInput = (String) DigSkillsDataGrade.getSelectedItem();
                String IoTTheoryInput = (String) iotTheoryGrade.getSelectedItem();
                String IoTPracticalInput = (String) iotPracticalGrade.getSelectedItem();
                String networkTheoryInput = (String) networkTheory.getSelectedItem();
                String networkPracticalInput = (String) networkPractical.getSelectedItem();
                String compSciInput = (String) compSciGrade.getSelectedItem();
                String cloudCompTheoryInput = (String) CloudCompTheoryGrade.getSelectedItem();
                String cloudCompPracInput = (String) cloudCompPrac.getSelectedItem();
                String softwareDevTheoryInput = (String) SoftDevTheoryGrade.getSelectedItem();
                String softwareDevPracInput = (String) SoftDevPracticalGrade.getSelectedItem();
                String professionalPracticeInput = (String) ProPractGrade.getSelectedItem();

                SummaryTxtAreaSubjects.setText(fullName + "\n" + "Your grades are:\n");


                SummaryTxtAreaSubjects.append("\nDigital Skills: Software Development Theory");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Software Development Practical");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Cyber Security");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Computer Science");
                SummaryTxtAreaSubjects.append("\nDigital Skills: Data Science");
                SummaryTxtAreaSubjects.append("\nInternet of Things Theory");
                SummaryTxtAreaSubjects.append("\nInternet of Things Practical");
                SummaryTxtAreaSubjects.append("\nNetwork Infrastructure Theory");
                SummaryTxtAreaSubjects.append("\nNetwork Infrastructure Practical");
                SummaryTxtAreaSubjects.append("\nComputer Science");
                SummaryTxtAreaSubjects.append("\nCloud Computing Theory");
                SummaryTxtAreaSubjects.append("\nCloud Computing Practical");
                SummaryTxtAreaSubjects.append("\nSoftware Development Theory");
                SummaryTxtAreaSubjects.append("\nSoftware Development Practical");
                SummaryTxtAreaSubjects.append("\nProfessional Practice");

                SummaryTxtAreaGrades.setText("\n\n");
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsSoftwareDevTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsSoftwareDevPracInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsCyberInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsCompSciInput);
                SummaryTxtAreaGrades.append("\n   -   " + digSkillsDataSciInput);
                SummaryTxtAreaGrades.append("\n   -   " + IoTTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + IoTPracticalInput);
                SummaryTxtAreaGrades.append("\n   -   " + networkTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + networkPracticalInput);
                SummaryTxtAreaGrades.append("\n   -   " + compSciInput);
                SummaryTxtAreaGrades.append("\n   -   " + cloudCompTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + cloudCompPracInput);
                SummaryTxtAreaGrades.append("\n   -   " + softwareDevTheoryInput);
                SummaryTxtAreaGrades.append("\n   -   " + softwareDevPracInput);
                SummaryTxtAreaGrades.append("\n   -   " + professionalPracticeInput);

                SummaryTxtAreaInfo.setText("We have assigned each grade with a value to help calculate if you are on track to \npass. After selecting and confirming a grade, we add the number assigned to that \ngrade to the total and if this total is above our threshold of 33 then you are on track to \npass, if below our threshold of 33 then you may still be able to pass, however you are \ncurrently on course for a pass.");
            }
        });


        backBtnSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(ProfessionalPractice);
                Background.repaint();
                Background.revalidate();


            }
        });


        nextBtnSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Results);
                Background.repaint();
                Background.revalidate();


                passPercentage = (total * 100) / 45;
                roundOffPassPercentage = Math.round(passPercentage * 100.0) / 100.0;
                percentagePass = (int) roundOffPassPercentage;

                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)" || DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 3)" || iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)" || iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || networkTheory.getSelectedItem() == "Fail. (Attempt 3)" || networkPractical.getSelectedItem() == "Fail. (Attempt 3)" || compSciGrade.getSelectedItem() == "Fail. (Attempt 3)" || CloudCompTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)" || SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)" || ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)" || total < 31) {
                    index = 2;
                } else if (total >= 32) {
                    index = 1;
                }


                double passPercentage = (total * 100) / 45;
                double roundOffPassPercentage = Math.round(passPercentage * 100.0) / 100.0;
                int percentagePass = (int) roundOffPassPercentage;

                ResultsTxtAreaInfo.setText("The total is calculated by adding on a set value dependant on the grade and \nattempt, to be on target, you must have a total of 33 or higher and must have \ngreater than a fail attempt 3.");
                ResultsTxtAreaName.setText("Name\n" + fullName);
                ResultsTxtAreaTotal.setText("Total\n" + total);
                ResultsTxtAreaOnTarget.setText("On Target\n" + onTarget[index]);
                ResultsTxtAreaPassPercentage.setText("Pass Percentage\n" + percentagePass + "%");
            }
        });


        backBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Summary);
                Background.repaint();
                Background.revalidate();
            }
        });

        saveBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File studenRefNo = new File(LogInStudentRefNumberTxtField.getText() + ".txt");
                try {
                    FileOutputStream fOut = new FileOutputStream(studenRefNo, false);
                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                    osw.write(fullName + ", " + DigSkillsSoftwareDevTheory.getSelectedItem() + ", " + DigSkillsSoftwareDevPrac.getSelectedItem() + ", " + DigSkillsCyberGrade.getSelectedItem() + ", " + DigSkillsCompSciGrade.getSelectedItem() + ", " + DigSkillsDataGrade.getSelectedItem() + ", " + iotTheoryGrade.getSelectedItem() + ", " + iotPracticalGrade.getSelectedItem() + ", " + networkTheory.getSelectedItem() + ", " + networkPractical.getSelectedItem() + ", " + compSciGrade.getSelectedItem() + ", " + CloudCompTheoryGrade.getSelectedItem() + ", " + cloudCompPrac.getSelectedItem() + ", " + SoftDevTheoryGrade.getSelectedItem() + ", " + SoftDevPracticalGrade.getSelectedItem() + ", " + ProPractGrade.getSelectedItem() + ", " + total + ", " + index + ", " + percentagePass + ", ");
                    osw.flush();
                    osw.close();
                } catch (Exception e2) {
                }
            }
        });
        editGradesBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

                total = 0;

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);
            }
        });
        signOutBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Clearing all text areas after sign out.
                signUpStudentReferenceTxtField.setText("");
                LogInStudentRefNumberTxtField.setText("");
                signUpPasswordTxtField.setText("");
                passwordJPasswordField.setText("");
                forenameTxtField.setText("");
                surnameTxtField.setText("");
                fullNameLbl.setText("");
                profileWelcomeTxtArea.setText("");
                profileSubjectsTxtArea.setText("");
                profileGradesTxtArea.setText("");
                profileNameTxtArea.setText("");
                profileTotalTxtArea.setText("");
                profileOnTargetTxtArea.setText("");
                profilePassPercentageTxtArea.setText("");
                ResultsTxtAreaInfo.setText("");
                ResultsTxtAreaName.setText("");
                ResultsTxtAreaTotal.setText("");
                ResultsTxtAreaOnTarget.setText("");
                ResultsTxtAreaPassPercentage.setText("");
                SummaryTxtAreaSubjects.setText("");
                SummaryTxtAreaGrades.setText("");

                //Setting grades to default.
                DigSkillsSoftwareDevTheory.setSelectedItem("Select Grade.");
                DigSkillsSoftwareDevPrac.setSelectedItem("Select Grade.");
                DigSkillsCyberGrade.setSelectedItem("Select Grade.");
                DigSkillsCompSciGrade.setSelectedItem("Select Grade.");
                DigSkillsDataGrade.setSelectedItem("Select Grade.");
                iotTheoryGrade.setSelectedItem("Select Grade.");
                iotPracticalGrade.setSelectedItem("Select Grade.");
                networkTheory.setSelectedItem("Select Grade.");
                networkPractical.setSelectedItem("Select Grade.");
                compSciGrade.setSelectedItem("Select Grade.");
                CloudCompTheoryGrade.setSelectedItem("Select Grade.");
                cloudCompPrac.setSelectedItem("Select Grade.");
                SoftDevTheoryGrade.setSelectedItem("Select Grade.");
                SoftDevPracticalGrade.setSelectedItem("Select Grade.");
                ProPractGrade.setSelectedItem("Select Grade.");

                //Resetting subject retry buttons
                networkRetryBtn.setEnabled(false);
                RetrybtnProfPrac.setEnabled(false);
                RetryCloudBtn.setEnabled(false);
                RetryCompScienceBtn.setEnabled(false);
                SoftDevRetryBtn.setEnabled(false);

                //Resetting subject confirm button
                confirmBtnNetworkInfrastructure.setEnabled(true);
                confirmBtnCloudComputing.setEnabled(true);
                confirmBtnSoftwareDevelopment.setEnabled(true);
                confirmBtnProfessionalPractice.setEnabled(true);
                confirmBtnComputerScience.setEnabled(true);

                //Setting the grades to editable
                SoftDevTheoryGrade.setEnabled(true);
                SoftDevPracticalGrade.setEnabled(true);

                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });
        quizBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(quizSelection);
                Background.repaint();
                Background.revalidate();

            }
        });


        RetryCompScienceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnComputerScience.setEnabled(true);
                compSciGrade.setEnabled(true);

                RetryCompScienceBtn.setEnabled(false);
                compSciNextButton.setEnabled(false);

                if (compSciGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    compSciLbl.setText(String.valueOf(0));
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    compSciLbl.setText(String.valueOf(0));
                } else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    cloudCompLbl.setText(String.valueOf(0));

                }


            }
        });


        networkRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmBtnNetworkInfrastructure.setEnabled(true);
                networkTheory.setEnabled(true);
                networkPractical.setEnabled(true);

                networkRetryBtn.setEnabled(false);
                networkNextButton.setEnabled(false);

                if (networkTheory.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    NetworkLbl.setText(String.valueOf(0));

                }
                if (networkPractical.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    NetworkLbl.setText(String.valueOf(0));
                } else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    NetworkLbl.setText(String.valueOf(0));

                }

            }
        });


        nextBtnQuizSelection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Getting the user's input from the quizSelector jComboBox to work out which quiz the user wants to attempt
                if (quizSelector.getSelectedItem() == "Digital Skills: Software Development.") {
                    Background.removeAll();
                    Background.add(DigSkillsSoftDevQuiz);
                    Background.repaint();
                    Background.revalidate();
                } else if (quizSelector.getSelectedItem() == "Digital Skills: Cyber Security.") {
                    Background.removeAll();
                    Background.add(DigSkillsCyberSecQuiz);
                    Background.repaint();
                    Background.revalidate();
                }

            }
        });

        DigSkillsSoftDevQuizBackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(quizSelection);
                Background.repaint();
                Background.revalidate();
            }
        });
        IotRetryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextButtonIoT.setEnabled(false);
                IotRetryBtn.setEnabled(false);
                iotTheoryGrade.setEnabled(true);
                iotPracticalGrade.setEnabled(true);
                confirmBtnIoT.setEnabled(true);

                if (iotTheoryGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    IotLbl.setText(String.valueOf(0));

                }
                if (iotPracticalGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    IotLbl.setText(String.valueOf(0));
                } else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    IotLbl.setText(String.valueOf(0));
                }
            }
        });


        DigSkillDataSciRetry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DigSkillsDataGrade.setEnabled(true);

                DigSkillDataSciRetry.setEnabled(false);

                confirmBtnDataScience.setEnabled(true);
                NextBtnData.setEnabled(false);

                if (DigSkillsDataGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DataLbl.setText(String.valueOf(0));
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DataLbl.setText(String.valueOf(0));
                } else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DataLbl.setText(String.valueOf(0));


                }
            }
        });
        DigSkillComSciRetry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnDigSkillsCompSci.setEnabled(true);
                nextBtnDigSkillsCompSci.setEnabled(false);
                DigSkillComSciRetry.setEnabled(false);
                DigSkillsCompSciGrade.setEnabled(true);


                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DigSkillsCompSciLbl.setText(String.valueOf(0));
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DigSkillsCompSciLbl.setText(String.valueOf(0));
                } else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DigSkillsCompSciLbl.setText(String.valueOf(0));

                }
            }
        });
        DigSkillCybSecRetry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnDSCS.setEnabled(true);
                NextBtnCyber.setEnabled(false);
                DigSkillCybSecRetry.setEnabled(false);
                DigSkillsCyberGrade.setEnabled(true);


                if (DigSkillsCyberGrade.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    dscsLbl.setText(String.valueOf(0));
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    dscsLbl.setText(String.valueOf(0));
                } else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    dscsLbl.setText(String.valueOf(0));


                }
            }
        });

        DigSkilSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                confirmBtnDigSkillsSoftware.setEnabled(true);
                NextBtnDigSkillsSoftware.setEnabled(false);
                DigSkilSoftDev.setEnabled(false);
                DigSkillsSoftwareDevTheory.setEnabled(true);
                DigSkillsSoftwareDevPrac.setEnabled(true);


                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));


                }
                if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Pass.") {
                    total = total - 3;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 1)") {
                    total = total - 2;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                } else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                    DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(0));
                }
            }
        });

        //Digital Skills Software Dev Quiz
        DigSkillsSoftDevQuizStartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //When pressed, moves the page onto DigSkillsSoftDevQuestion1 jPanel
                DigSkillsSoftDevQuiz.removeAll();
                DigSkillsSoftDevQuiz.add(DigSkillsSoftDevQuestion1);
                DigSkillsSoftDevQuiz.repaint();
                DigSkillsSoftDevQuiz.revalidate();

                //Disables nextQBtnDigSkillsSoftDevQ1
                nextQBtnDigSkillsSoftDevQ1.setEnabled(false);

            }
        });

        //Digital Skills Software Dev Question 1
        //Digital Skills Software Dev Question 1 Confirm Button
        confirmAnsBtnsDigSkillsSoftDevQ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks the selected radio button and tells the user if their answer is correct or incorrect
                if (ansCRadioBtnDigSkillsSoftDevQ1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You have selected the correct answer.");
                    quizTotal = quizTotal + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect answer! The correct answer would be C (Firmware).");
                    quizTotal = quizTotal + 0;
                }
                //Displays the correct answer and enables the next button
                nextQBtnDigSkillsSoftDevQ1.setEnabled(true);

                //Disables the radio buttons and the confirm button
                ansARadioBtnDigSkillsSoftDevQ1.setEnabled(false);
                ansBRadioBtnDigSkillsSoftDevQ1.setEnabled(false);
                ansCRadioBtnDigSkillsSoftDevQ1.setEnabled(false);
                ansDRadioBtnDigSkillsSoftDevQ1.setEnabled(false);
                confirmAnsBtnsDigSkillsSoftDevQ1.setEnabled(false);
                correctAnsDigSkillsSoftDevQ1TxtPane.setText("The correct answer is: C");
            }
        });

        //Digital Skills Software Dev Question 1 next button
        nextQBtnDigSkillsSoftDevQ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigSkillsSoftDevQuiz.removeAll();
                DigSkillsSoftDevQuiz.add(DigSkillsSoftDevQuestion2);
                DigSkillsSoftDevQuiz.repaint();
                DigSkillsSoftDevQuiz.revalidate();
                nextQBtnDigSkillsSoftDevQ2.setEnabled(false);
            }
        });

        //Digital Skills Software Dev Question 2
        //Digital Skills Software Dev Question 2 confirm button
        confirmAnsBtnDigSkillsSoftDevQ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks the selected radio button and tells the user if their answer is correct or incorrect
                if (ansBRadioBtnDigSkillsSoftDevQ2.isSelected()){
                    JOptionPane.showMessageDialog(null, "Congratulations! You have selected the correct answer.");
                    quizTotal = quizTotal + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect answer! The correct answer would be B.");
                    quizTotal = quizTotal + 0;
                }
                //Displays the correct answer and enables the next button
                nextQBtnDigSkillsSoftDevQ2.setEnabled(true);

                //Disables the radio buttons and the confirm button
                ansARadioBtnDigSkillsSoftDevQ2.setEnabled(false);
                ansBRadioBtnDigSkillsSoftDevQ2.setEnabled(false);
                ansCRadioBtnDigSkillsSoftDevQ2.setEnabled(false);
                ansDRadioBtnDigSkillsSoftDevQ2.setEnabled(false);
                confirmAnsBtnDigSkillsSoftDevQ2.setEnabled(false);
                correctAnsDigSkillsSoftDevQ2TxtPane.setText("The correct answer is: B");
                }

        });

        //Digital Skills Software Dev Question 2 next button
        nextQBtnDigSkillsSoftDevQ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigSkillsSoftDevQuiz.removeAll();
                DigSkillsSoftDevQuiz.add(DigSkillsSoftDevQuestion3);
                DigSkillsSoftDevQuiz.repaint();
                DigSkillsSoftDevQuiz.revalidate();
                nextQBtnDigSkillsSoftDevQ3.setEnabled(false);
            }
        });

        //Digital Skills Software Dev Question 3
        //Digital Skills Software Dev Question 3 confirm button
        confirmAnsBtnDigSkillsSoftDevQ3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks the selected radio button and tells the user if their answer is correct or incorrect
                if (ansARadioBtnDigSkillsSoftDevQ3.isSelected() || ansBRadioBtnDigSkillsSoftDevQ3.isSelected() || ansCRadioBtnDigSkillsSoftDevQ3.isSelected()){
                    JOptionPane.showMessageDialog(null, "Congratulations! You have selected the correct answer.");
                    quizTotal = quizTotal + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect answer! The correct answer would be A, B, C.");
                    quizTotal = quizTotal + 0;
                }
                //Displays the correct answer and enables the next button
                nextQBtnDigSkillsSoftDevQ3.setEnabled(true);

                //Disables the radio buttons and the confirm button
                ansARadioBtnDigSkillsSoftDevQ3.setEnabled(false);
                ansBRadioBtnDigSkillsSoftDevQ3.setEnabled(false);
                ansCRadioBtnDigSkillsSoftDevQ3.setEnabled(false);
                ansDRadioBtnDigSkillsSoftDevQ3.setEnabled(false);
                confirmAnsBtnDigSkillsSoftDevQ3.setEnabled(false);
                correctAnsDigSkillsSoftDevQ3TxtPane.setText("The correct answers are: A, B, C");
            }
        });
        //Digital Skills Software Dev Question 3 next button
        nextQBtnDigSkillsSoftDevQ3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigSkillsSoftDevQuiz.removeAll();
                DigSkillsSoftDevQuiz.add(DigSkillsSoftDevQuestion4);
                DigSkillsSoftDevQuiz.repaint();
                DigSkillsSoftDevQuiz.revalidate();
                nextQBtnDigSkillsSoftDevQ4.setEnabled(false);
            }
        });

        //Digital Skills Software Dev Question 4
        //Digital Skills Software Dev Question 4 confirm button
        confirmAnsBtnDigSkillsSoftDevQ4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Checks the selected radio button and tells the user if their answer is correct or incorrect
                if (ansBRadioBtnDigSkillsSoftDevQ4.isSelected() || ansCRadioBtnDigSkillsSoftDevQ4.isSelected()){
                    JOptionPane.showMessageDialog(null, "Congratulations! You have selected the correct answer.");
                    quizTotal = quizTotal + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect answer! The correct answer would be B, C.");
                    quizTotal = quizTotal + 0;
                }
                //Displays the correct answer and enables the next button
                nextQBtnDigSkillsSoftDevQ4.setEnabled(true);

                //Disables the radio buttons and the confirm button
                ansARadioBtnDigSkillsSoftDevQ4.setEnabled(false);
                ansBRadioBtnDigSkillsSoftDevQ4.setEnabled(false);
                ansCRadioBtnDigSkillsSoftDevQ4.setEnabled(false);
                ansDRadioBtnDigSkillsSoftDevQ4.setEnabled(false);
                confirmAnsBtnDigSkillsSoftDevQ4.setEnabled(false);
                correctAnsDigSkillsSoftDevQ4TxtPane.setText("The correct answers are: B, C");
            }
        });

        //Digital Skills Software Dev Question 4 next button
        nextQBtnDigSkillsSoftDevQ4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigSkillsSoftDevQuiz.removeAll();
                DigSkillsSoftDevQuiz.add(DigSkillsSoftDevQuestion5);
                DigSkillsSoftDevQuiz.repaint();
                DigSkillsSoftDevQuiz.revalidate();
                nextQBtnDigSkillsSoftDevQ5.setEnabled(false);
            }
        });

        //Digital Skills Software Dev Question 5
        //Digital Skills Software Dev Question 5 confirm button
        confirmAnsBtnDigSkillsSoftDevQ5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks the selected radio button and tells the user if their answer is correct or incorrect
                if (ansCRadioBtnDigSkillsSoftDevQ5.isSelected()){
                    JOptionPane.showMessageDialog(null, "Congratulations! You have selected the correct answer.");
                    quizTotal = quizTotal + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect answer! The correct answer would be C.");
                    quizTotal = quizTotal + 0;
                }
                //Displays the correct answer and enables the next button
                nextQBtnDigSkillsSoftDevQ5.setEnabled(true);

                //Disables the radio buttons and the confirm button
                ansARadioBtnDigSkillsSoftDevQ5.setEnabled(false);
                ansBRadioBtnDigSkillsSoftDevQ5.setEnabled(false);
                ansCRadioBtnDigSkillsSoftDevQ5.setEnabled(false);
                ansDRadioBtnDigSkillsSoftDevQ5.setEnabled(false);
                confirmAnsBtnDigSkillsSoftDevQ5.setEnabled(false);
                correctAnsDigSkillsSoftDevQ5TxtPane.setText("The correct answer is: C");
            }
        });

    }
}





































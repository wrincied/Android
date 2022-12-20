package com.example.helloworld.lesson14.homework;


public class acceptCall {
    int idNumber;
    String purposeOfCall;

    public acceptCall() {
        this.idNumber = setIdNumber();
        this.purposeOfCall = setPurposeOfCall();
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPurposeOfCallOfCall() {
        return purposeOfCall;
    }

    public int setIdNumber() {
        return idNumber = (int) (Math.random() * 9900);
    }

    public String setPurposeOfCall() {
        try {
            int typeOfAim = (int) (Math.random() * 7) + 1;
            switch (typeOfAim) {
                case 1:
                    purposeOfCall = "Bank account information";
                    break;
                case 2:
                    purposeOfCall = "Block account";
                    break;
                case 3:
                    purposeOfCall = "Make a transfer to an account";
                    break;
                case 4:
                    purposeOfCall = "Bank card information";
                    break;
                case 5:
                    purposeOfCall = "Block bank card";
                    break;
                case 6:
                    purposeOfCall = "Make a card transfer";
                    break;
                case 7:
                    purposeOfCall = "Leave an application for issuing and reissuing a card";
                    break;
            }
        } catch (Exception e) {
            System.out.println("Wrong Input. Try again");
        }
        return purposeOfCall;
    }

    public void printInfoAboutCall(String nameOfWorker) {
        System.out.println("Call id: " + getIdNumber() + "\n" + "Purpose of Call: " + getPurposeOfCallOfCall() + "\n" + "The call has been processed: " + nameOfWorker);
    }
}

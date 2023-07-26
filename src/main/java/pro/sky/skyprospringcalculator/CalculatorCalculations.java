package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorCalculations implements CalculatorService{

    public String hello(){
        return "<b>Добро пожаловать в калькулятор!<b>";
    }
    public String plus(String num1, String num2){
        if ((num1 == "") || (num2 == "")) {
            return "Переданы не все параметры!";
        } else return num1+" + "+num2+ " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }
    public String minus(String num1, String num2){
        if ((num1 == "") || (num2 == "")) {
            return "Переданы не все параметры!";
        } else return num1+" - "+num2+ " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }
    public String multiply(String num1, String num2){
        if ((num1 == "") || (num2 == "")) {
            return "Переданы не все параметры!";
        } else return num1+" * "+num2+ " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }
    public String divide(String num1, String num2) {
        if ((num1 == "") || (num2 == "")) {
            return "Переданы не все параметры!";
        } else {
            if (Integer.parseInt(num2) == 0) {
                return "<b>Делить на ноль нельзя!<b>";
            } else return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));
        }
    }
}

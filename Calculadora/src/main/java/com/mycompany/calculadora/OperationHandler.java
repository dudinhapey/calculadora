/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 08211
 */

public class OperationHandler {

    static double num1 = 0, num2 = 0, result = 0;
    static char operator;

    public static void connect(CalculatorUI ui) {

        ui.addButton.addActionListener(e -> {
            num1 = Double.parseDouble(ui.textfield.getText());
            operator = '+';
            ui.textfield.setText("");
        });

        ui.subButton.addActionListener(e -> {
            num1 = Double.parseDouble(ui.textfield.getText());
            operator = '-';
            ui.textfield.setText("");
        });

        ui.mulButton.addActionListener(e -> {
            num1 = Double.parseDouble(ui.textfield.getText());
            operator = '*';
            ui.textfield.setText("");
        });

        ui.divButton.addActionListener(e -> {
            num1 = Double.parseDouble(ui.textfield.getText());
            operator = '/';
            ui.textfield.setText("");
        });

        ui.equButton.addActionListener(e -> {
            num2 = Double.parseDouble(ui.textfield.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            ui.textfield.setText(String.valueOf(result));
            num1 = result;
        });

        ui.clearButton.addActionListener(e -> ui.textfield.setText(""));

        ui.delButton.addActionListener(e -> {
            String text = ui.textfield.getText();
            if (!text.isEmpty()) {
                ui.textfield.setText(text.substring(0, text.length() - 1));
            }
        });

        ui.negButton.addActionListener(e -> {
            double temp = Double.parseDouble(ui.textfield.getText());
            temp *= -1;
            ui.textfield.setText(String.valueOf(temp));
        });
    }
}

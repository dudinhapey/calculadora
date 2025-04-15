/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 08208
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Number {

    public static void connect(CalculatorUI ui) {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            ui.numberBut[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ui.textfield.setText(ui.textfield.getText().concat(String.valueOf(finalI)));
                }
            });
        }

        ui.decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.textfield.setText(ui.textfield.getText().concat("."));
            }
        });
    }
}
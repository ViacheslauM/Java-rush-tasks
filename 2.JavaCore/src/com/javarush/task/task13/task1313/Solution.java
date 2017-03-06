package com.javarush.task.task13.task1313;

import java.awt.*;

/* 
Интерфейс Animal
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default public Color getColor() {
            return null;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
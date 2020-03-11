/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_15;

/**
 *
 * @author Администратор
 */

public enum DayOfWeek {
    
    MONDAY("Понедельник") {
        @Override
        public DayOfWeek next() {
            return THUESDAY;
        }
    },
    THUESDAY("Вторник") {
        @Override
        public DayOfWeek next() {
            return WEDNESDAY;
        }
    },
    WEDNESDAY("Среда") {
        @Override
        public DayOfWeek next() {
            return MONDAY;
        }
    };
    
    private final String str;
    
    DayOfWeek(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    
    public abstract DayOfWeek next();
}


class Days {
    public static final String MONDAY = "ПН";
    
    
    
}


class DayOfWeekTest {
    public static void main(String[] args) {
        for(DayOfWeek day : DayOfWeek.values()){
            System.out.printf(
                    "%s: %s, next = %s%n", 
                    day, 
                    day.getStr(), 
                    day.next()
            );
            System.out.println(day.ordinal());
        }
    }
    
}
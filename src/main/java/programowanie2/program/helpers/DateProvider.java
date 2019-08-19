package pl.sdacademy.java16poz.programowanie2.program.helpers;

import java.util.Date;

public class DateProvider implements IDateProvider {

    @Override
    public Date getDate() {
        return new Date();
    }
}

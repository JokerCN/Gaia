package com.winchampion.property;

import javax.swing.*;
import java.awt.*;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/18.
 */
public class ChartBean extends JPanel{
    private int titlePosition = 1;
    private boolean inverse;

    public int getTitlePosition() {
        return titlePosition;
    }

    public void setTitlePosition(int titlePosition) {
        this.titlePosition = titlePosition;
    }

    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }
}

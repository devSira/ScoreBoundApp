/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboundapp;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Siraphob.B
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SCORELINE_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreLine() {
        return scoreLine;
    }
    
    public void setScoreLine(String scoreLine) {
        String oldValue = this.scoreLine;
        this.scoreLine = scoreLine;
        propertySupport.firePropertyChange(SCORELINE_PROPERTY, oldValue, this.scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}

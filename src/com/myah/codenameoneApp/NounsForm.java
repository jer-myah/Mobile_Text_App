/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myah.codenameoneApp;

/**
 * GUI builder created Form
 *
 * @author Myah
 */
public class NounsForm extends com.codename1.ui.Form {

    public NounsForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public NounsForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_Span_Label = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_Span_Label_1 = new com.codename1.components.SpanLabel();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button_1.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Button_1) {
                onButton_1ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("Nouns");
        setName("NounsForm");
        addComponent(gui_Container_1);
        gui_Container_1.setScrollVisible(true);
        gui_Container_1.setScrollableY(true);
                gui_Container_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(gui_Button_1);
        gui_Button_1.setText("Back");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
        addComponent(gui_Label);
        addComponent(gui_Span_Label);
        addComponent(gui_Label_1);
        addComponent(gui_Span_Label_1);
        gui_Container_1.setScrollVisible(true);
        gui_Container_1.setScrollableY(true);
                gui_Container_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_1.setName("Container_1");
        gui_Label.setText("Definition");
        gui_Label.setUIID("Labeldef");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setInlineAllStyles("font:4.0mm;");
        gui_Label.setName("Label");
        gui_Span_Label.setText("A noun is generally defined as the name of any person, place or thing. In other words, a noun is an identifier.");
                gui_Span_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Span_Label.setName("Span_Label");
        gui_Label_1.setText("Types of Nouns");
        gui_Label_1.setUIID("Labelkj");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setInlineAllStyles("font:4.0mm;");
        gui_Label_1.setName("Label_1");
        gui_Span_Label_1.setScrollVisible(true);
        gui_Span_Label_1.setText("There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. There are several types of noun. We are going to be looking at few ones here. ");
                gui_Span_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Span_Label_1.setName("Span_Label_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        MenuForm mnfm = new MenuForm();
        mnfm.showBack();
    }

}

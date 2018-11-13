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
public class MenuForm extends com.codename1.ui.Form {

    public MenuForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MenuForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_adjective = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_3 = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button_1.addActionListener(callback);
        gui_Button_2.addActionListener(callback);
        gui_adjective.addActionListener(callback);
        gui_Button_3.addActionListener(callback);
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
            if(sourceComponent == gui_Button_2) {
                onButton_2ActionEvent(ev);
            }
            if(sourceComponent == gui_adjective) {
                onadjectiveActionEvent(ev);
            }
            if(sourceComponent == gui_Button_3) {
                onButton_3ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("English Text");
        setName("MenuForm");
        addComponent(gui_Button_1);
        addComponent(gui_Button_2);
        addComponent(gui_adjective);
        addComponent(gui_Button_3);
        gui_Button_1.setText("Nouns");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
        gui_Button_2.setText("Verbs");
                gui_Button_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_2.setName("Button_2");
        gui_adjective.setScrollVisible(true);
        gui_adjective.setText("Adjectives");
        gui_adjective.setUIID("Button");
                gui_adjective.setInlineStylesTheme(resourceObjectInstance);
        gui_adjective.setInlineAllStyles("font:3.0mm;");
        gui_adjective.setName("adjective");
        gui_Button_3.setText("Exit");
                gui_Button_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_3.setName("Button_3");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        NounsForm nounsform = new NounsForm();
        nounsform.show();
    }

    public void onButton_3ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        System.exit(0);
    }

    public void onButton_2ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        Verbs verbs = new Verbs();
        verbs.show();
    }

    
    public void onadjectiveActionEvent(com.codename1.ui.events.ActionEvent ev) {
        Adjectives adj = new Adjectives();
        adj.show();
    }

}

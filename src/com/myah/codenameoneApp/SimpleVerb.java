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
public class SimpleVerb extends com.codename1.ui.Form {

    public SimpleVerb() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public SimpleVerb(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    private com.codename1.components.SpanLabel gui_Span_Label = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button.addActionListener(callback);
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

            if(sourceComponent == gui_Button) {
                onButtonActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("Simple Verb");
        setName("SimpleVerb");
        addComponent(gui_Button);
        addComponent(gui_Span_Label);
        addComponent(gui_Label);
        gui_Button.setPreferredSizeStr("15.873016mm inherit");
        gui_Button.setText("Back");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "0.0mm auto auto 0.0mm").setReferenceComponents(gui_Button, "-1 -1 -1 -1").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
        gui_Span_Label.setPreferredSizeStr("118.78307mm inherit");
        gui_Span_Label.setText("The Pidgin language had been rooted so deep in some African countries. It is not a \u2018valid\u2019 official language but had gained popular usage in many parts of Africa. Many understand this far better than the English language. The Pidgin language had been rooted so deep in some African countries. It is not a \u2018valid\u2019 official language but had gained popular usage in many parts of Africa. Many understand this far better than the English language. The Pidgin language had been rooted so deep in some African countries. It is not a \u2018valid\u2019 official language but had gained popular usage in many parts of Africa. Many understand this far better than the English language. The Pidgin language had been rooted so deep in some African countries. It is not a \u2018valid\u2019 official language but had gained popular usage in many parts of Africa. Many understand this far better than the English language. The Pidgin language had been rooted so deep in some African countries. It is not a \u2018valid\u2019 official language but had gained popular usage in many parts of Africa. Many understand this far better than the English language.  The Pidgin language had been rooted so deep in some African countries. It is not a \u2018valid\u2019 official language but had gained popular usage in many parts of Africa. Many understand this far better than the English language.");
                gui_Span_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Span_Label.setName("Span_Label");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Span_Label.getParent().getLayout()).setInsets(gui_Span_Label, "7.0mm 24.85465% 0.0mm 5.0mm").setReferenceComponents(gui_Span_Label, "-1 -1 -1 -1").setReferencePositions(gui_Span_Label, "0.0 0.0 0.0 0.0");
        gui_Label.setText("Definition");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "0.0mm auto auto 12.741936%").setReferenceComponents(gui_Label, "0 -1 -1 0 ").setReferencePositions(gui_Label, "0.0 0.0 0.0 1.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButtonActionEvent(com.codename1.ui.events.ActionEvent ev) {
        new Verbs().showBack();
    }

}

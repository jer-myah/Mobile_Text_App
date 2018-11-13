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
public class Verbs extends com.codename1.ui.Form {

    public Verbs() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Verbs(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Flow_Layout = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_Span_Label = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_Span_Label_1 = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button.addActionListener(callback);
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

            if(sourceComponent == gui_Button) {
                onButtonActionEvent(ev);
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
        setTitle("Verbs");
        setName("Verbs");
        addComponent(gui_Flow_Layout);
                gui_Flow_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Flow_Layout.setName("Flow_Layout");
        gui_Flow_Layout.addComponent(gui_Button);
        gui_Button.setText("Back");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        addComponent(gui_Label);
        addComponent(gui_Span_Label);
        addComponent(gui_Label_1);
        addComponent(gui_Span_Label_1);
        addComponent(gui_Container);
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setName("Container");
        gui_Container.addComponent(gui_Button_1);
        gui_Button_1.setText("Simple Verbs");
        gui_Button_1.setUIID("Buttong");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setInlineAllStyles("font:3.0mm; transparency:68;");
        gui_Button_1.setName("Button_1");
                gui_Flow_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Flow_Layout.setName("Flow_Layout");
        gui_Label.setText("Definition");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setInlineAllStyles("font:4.0mm;");
        gui_Label.setName("Label");
        gui_Span_Label.setText("Addressing modes are an aspect of the instruction set architecture in most central processing unit (CPU) designs. The various addressing modes that are defined in a given instruction set architecture define how machine language instructions in that architecture identify the operand (or operands) of each instruction. An addressing mode specifies how to calculate the effective memory address of an operand by using information held in registers and/or constants contained within a machine instruction or elsewhere. In computer programming, addressing modes are primarily of interest to compiler writers and to those who write code directly in assembly language. Note that there is no generally accepted way of naming the various addressing modes. In particular, different authors and computer manufacturers may give different names to the same addressing mode, or the same names to different addressing modes. Furthermore, an addressing mode which, in one given architecture, is treated as a single addressing mode may represent functionality that, in another architecture, is covered by two or more addressing modes. For example, some complex instruction set computer (CISC) computer architectures, such as the Digital Equipment Corporation (DEC) VAX, treat registers and literal/immediate constants as just another addressing mode. Others, such as the IBM System/390 and most reduced instruction set computer (RISC) designs, encode this information within the instruction. Thus, the latter machines have three distinct instruction codes for copying one register to another, copying a literal constant into a register, and copying the contents of a memory location into a register, while the VAX has only a single ");
                gui_Span_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Span_Label.setInlineAllStyles("font:3.0mm;");
        gui_Span_Label.setName("Span_Label");
        gui_Label_1.setText("Types of Verbs");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setInlineAllStyles("font:4.0mm;");
        gui_Label_1.setName("Label_1");
        gui_Span_Label_1.setText("Example 1: Within a subroutine a programmer will mainly be interested in the parameters and the local variables, which will rarely exceed 64 KB, for which one base register (the frame pointer) suffices. If this routine is a class method in an object-oriented language, then a second base register is needed which points at the attributes for the current object (this or self in some high level languages).Example 1: Within a subroutine a programmer will mainly be interested in the parameters and the local variables, which will rarely exceed 64 KB, for which one base register (the frame pointer) suffices. If this routine is a class method in an object-oriented language, then a second base register is needed which points at the attributes for the current object (this or self in some high level languages).");
                gui_Span_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Span_Label_1.setInlineAllStyles("font:3.0mm;");
        gui_Span_Label_1.setName("Span_Label_1");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setName("Container");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButtonActionEvent(com.codename1.ui.events.ActionEvent ev) {
        MenuForm menuform = new MenuForm();
        menuform.showBack();
    }

    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        SimpleVerb simpleVerb = new SimpleVerb();
        simpleVerb.show();
        
    }

}

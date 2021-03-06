/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2013 Christian Altmeier
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.plugin.intelligentdos.ui.option;

import wsattacker.gui.component.pluginconfiguration.composition.OptionGUI;
import wsattacker.main.composition.plugin.option.AbstractOption;
import wsattacker.plugin.intelligentdos.option.PerformPersistOption;

/**
 * @author Christian Altmeier
 */
public class PerformPersistOptionGUI_NB
    extends OptionGUI
{
    public static final String PROP_OPTION = "option";

    private PerformPersistOption option;

    /**
     * Creates new form PerformPersistOptionGUI_NB
     * 
     * @param performPersistOption
     */
    public PerformPersistOptionGUI_NB( PerformPersistOption performPersistOption )
    {
        this.option = performPersistOption;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        initComponents();
    }

    public PerformPersistOption getOption()
    {
        return option;
    }

    public void setOption( PerformPersistOption option )
    {
        PerformPersistOption oldOption = this.option;
        this.option = option;
        firePropertyChange( PROP_OPTION, oldOption, option );
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setPreferredSize( new java.awt.Dimension( 319, 126 ) );

        jLabel1.setText( "specify folder" );

        jTextField1.setEnabled( false );

        org.jdesktop.beansbinding.Binding binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  this,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${option.baseDir}" ),
                                                                  jTextField1,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        jCheckBox1.setText( "persist all attacks" );
        jCheckBox1.setToolTipText( option.getDescription() );
        jCheckBox1.addActionListener( new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed( java.awt.event.ActionEvent evt )
            {
                jCheckBox1ActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout( jPanel2 );
        jPanel2.setLayout( jPanel2Layout );
        jPanel2Layout.setHorizontalGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( jPanel2Layout.createSequentialGroup().addComponent( jCheckBox1,
                                                                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                       707,
                                                                                                                                                                                       Short.MAX_VALUE ).addGap( 2,
                                                                                                                                                                                                                 2,
                                                                                                                                                                                                                 2 ).addComponent( jLabel1 ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addComponent( jTextField1,
                                                                                                                                                                                                                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                 109,
                                                                                                                                                                                                                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE ) ) );
        jPanel2Layout.setVerticalGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( jCheckBox1 ).addComponent( jTextField1,
                                                                                                                                                                                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( jLabel1 ) ) );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( this );
        this.setLayout( layout );
        layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( jPanel2,
                                                                                                                         javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                         javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                         Short.MAX_VALUE ) );
        layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( jPanel2,
                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE ) );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed( java.awt.event.ActionEvent evt )
    {// GEN-FIRST:event_jCheckBox1ActionPerformed
        jTextField1.setEditable( jCheckBox1.isSelected() );
    }// GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JTextField jTextField1;

    private transient org.jdesktop.beansbinding.BindingGroup bindingGroup;

    // End of variables declaration//GEN-END:variables

    @Override
    public void bindingDoUnbind()
    {
        bindingGroup.unbind();
    }

    @Override
    public AbstractOption getUsedOption()
    {
        return option;
    }

}

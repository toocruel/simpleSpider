/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuaqu.ali1688.ui;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

import com.browe.Test;
import com.ydj.simpleSpider.MyLog;


/**
 * 
 * @author : Apple
 * @createTime : Aug 17, 2012 1:49:22 PM
 * @version : 1.0
 * @description :
 */
public class ReSetJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
     * Creates new form NewJFrame
     */
    public ReSetJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void initComponents() {

    	this.setTitle("抓 抓 抓...抓个蛋蛋----修改设置");
    	
        jLabel_cookie = new javax.swing.JLabel();
		jTextField_cookie = new javax.swing.JTextField();
		
        jLabel_userAgent = new javax.swing.JLabel();
        jTextField_userAgent = new javax.swing.JTextField();
        
        
        jLabel_alertSet = new javax.swing.JLabel();
        jTextField_alertSet = new javax.swing.JComboBox();
        
        jLabel_frequencySet = new javax.swing.JLabel();
        jTextField_frequencySet = new javax.swing.JComboBox();
        
        
        jButton_connect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_userAgent.setText("设置UserAgent");
        jLabel_cookie.setText("设置Cookie");
        jLabel_alertSet.setText("设置提醒次数");
        jLabel_frequencySet.setText("设置抓取频率");

        
        jButton_connect.setText("开始抓取");
        jButton_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectJButtonActionPerformed(evt);
            }
        });
        
        
        Object items[] = new Object[]{5,10,15,20,25,30,50}; 
        jTextField_alertSet.setModel(new javax.swing.DefaultComboBoxModel(items));
        
        
        Object items2[] = new Object[]{"500毫秒~1秒","1秒~3秒","1秒~5秒","2秒~6秒"}; 
        jTextField_frequencySet.setModel(new javax.swing.DefaultComboBoxModel(items2));
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_cookie)
                            .addComponent(jLabel_userAgent)
                            .addComponent(jLabel_alertSet)
                            .addComponent(jLabel_frequencySet)
                            
                        		)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_cookie)
                            .addComponent(jTextField_alertSet)
                            .addComponent(jTextField_frequencySet)
                            .addComponent(jTextField_userAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            
                        		)
                        		
                        		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false))
                        		
                    		)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton_connect)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_userAgent)
                    .addComponent(jTextField_userAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    
                    
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cookie)
                    .addComponent(jTextField_cookie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_alertSet)
                    .addComponent(jTextField_alertSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_frequencySet)
                    .addComponent(jTextField_frequencySet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 
                            
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton_connect)
                .addGap(24, 24, 24))
        );

        
        pack();
        
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(ReSetJFrame.class.getResource("logo.png"))); 
        this.setResizable(false);//设置不可以最大化
        this.setLocationRelativeTo(null);
    }
    
    

    private void connectJButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	String cookie = this.jTextField_cookie.getText();
    	String userAgent = this.jTextField_userAgent.getText();
    	Object alertSet = jTextField_alertSet.getSelectedItem();
    	Object frequencySet = jTextField_frequencySet.getSelectedItem();
    	
    	MyLog.logInfo("userAgent: "+userAgent);
    	MyLog.logInfo("cookie: "+cookie);
    	MyLog.logInfo("alertSet: "+alertSet.toString());
    	MyLog.logInfo("frequencySet: "+frequencySet.toString());
    	
    	String url = "https://sec.1688.com/query.htm?smApp=kylin&smPolicy=kylin-index-anti_Spider-seo-html-checkcode&smCharset=GBK&smTag=NTguMjQ3LjExMi44Miw0NDg2OTQ3MDQsNTY2ZWQ0YzY0MTEwNDNlYTk3NDQ0YTc0OTkxNDNiN2Q%3D&smReturn=https%3A%2F%2Fshop1413621119921.1688.com%2F&smSign=RK3rud0KvlC133bJny4wzQ%3D%3D";
		
		Test test = new Test(url);
		test.brower(url, url);

//    	if(cookie == null || "".equals(cookie)){
//    		JOptionPane.showMessageDialog(null, "请设置Cookie和UserAgent","提示",JOptionPane.ERROR_MESSAGE); 
//    		return ;
//    	}
    	
    	Common2.cookie = cookie;
    	Common2.userAgent = userAgent;
    	
    	SecondStep2.alertCount = Integer.parseInt(alertSet.toString());
    	
    	this.frequencySet(frequencySet.toString());

    	//TODO: 保存用户输入，缓存
    	
    	this.setVisible(false);
    	
    	final SecondStep2 spider = new SecondStep2();

    	ShowJFrame showJFrame = new ShowJFrame(spider);
    	showJFrame.setVisible(true);
    	
    	new Thread(
    			new Runnable() {
					
					@Override
					public void run() {
						try {
							spider.start();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
    	).start();
    	
    	
    	
    	
    }
    
    
    private void frequencySet(String choose){
    	// "500毫秒~1秒","1秒~3秒","1秒~5秒","2秒~6秒"
    	
    	if("500毫秒~1秒".equals(choose)){
    		SecondStep2.frequencyMin = 500;
    		SecondStep2.frequencyMax = 1000;
    	}
    	
    	if("1秒~3秒".equals(choose)){
    		SecondStep2.frequencyMin = 1000;
    		SecondStep2.frequencyMax = 3000;
    	}
    	
    	if("1秒~5秒".equals(choose)){
    		SecondStep2.frequencyMin = 1000;
    		SecondStep2.frequencyMax = 5000;
    	}
    	
    	if("2秒~6秒".equals(choose)){
    		SecondStep2.frequencyMin = 2000;
    		SecondStep2.frequencyMax = 6000;
    	}
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReSetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReSetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReSetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReSetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    	
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReSetJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_userAgent;
    private javax.swing.JLabel jLabel_cookie;
    private javax.swing.JLabel jLabel_alertSet;
    private javax.swing.JLabel jLabel_frequencySet;

    @SuppressWarnings("rawtypes")
    private javax.swing.JTextField jTextField_userAgent;
    private javax.swing.JTextField jTextField_cookie;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jTextField_alertSet;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jTextField_frequencySet;
    
    private javax.swing.JButton jButton_connect;
    
    // End of variables declaration//GEN-END:variables
}

Java 图像用户界面笔记 edited by Zhangfan /Date:2018/5/8

基础知识： JAVA图像界面实现有2种，一种是awt,另一种是swing. swing使用的较多

大致操作步骤总结，
（1）先搭建一个框架，就是一个框框。 利用JFrame： JFrame jf=new JFrame("Title of the structure");
（2）再向框架里面添加组件。组件会有按钮（JButton）,文本（JTextField,JTextArea）标签（JLabel）etc.
（3）再监听组件之间的关系，事件模型（推/拉模型）
（4）控制页面布局 BorderLayout（默认布局，东南西北中）FlowLayout(流线型) GridLayout（表格式，需要制定N*M)



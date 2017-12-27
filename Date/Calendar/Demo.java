Calendar c1=Calendar.getInstance();//initialize object
c1.set(2017,12-1,27);//set  date ？-1？


//set设置
Calendar c1=Calendar.getInstance();
public final void set(int year,int month,int year){
  c1.set(2017,12-1,27)//把Calendar对象c1的年月日分别设这为：2017、12、27 ？-1？
}

//只用到部分字段
Calendar c1=Calendar.getInstance();

public void set(int feild,int value)
{
  c1.set(Calendar.DATE,27);
  c1.set(Calendar.MONTH,12);
  c1.set(Calendar.YEAR,27);
}

//Add设置
Calendar c1=Calendar.getInstance();
c1.add(Calendar.DATE,10)//当前日期加10天
c1.add(Calendar.DATE,-10)//当前日期减10天

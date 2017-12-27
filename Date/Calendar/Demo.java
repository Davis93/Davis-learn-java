Calendar c1=Calendar.getInstance();//initialize object
c1.set(2017,12-1,27);//set  date ？-1？


//set设置
Calendar c1=Calendar.getInstance();
public final void set(int year,int month,int year){
  c1.set(2017,12-1,27)//把Calendar对象c1的年月日分别设这为：2017、12、27 ？-1？
}

//只用到部分字段
Calendar c1=Calendar.getInstance();

public void set(int field,int value)
{
  c1.set(Calendar.DATE,27);
  c1.set(Calendar.MONTH,12);
  c1.set(Calendar.YEAR,27);
}

//Add设置
Calendar c1=Calendar.getInstance();
c1.add(Calendar.DATE,10)//当前日期加10天
c1.add(Calendar.DATE,-10)//当前日期减10天

  //Calendar 类对象信息的获取
  Calendar c1=Calendar.getInstance();
  int year=c1.get(Calendar.YEAR);//年份
  int month=c1.get(Calendar.MONTH)+1;//月份
  int date=c1.get(Calendar.DATE);//日期
  int hour=c1.get(Calendar.HOUR_OF_DAY);//24小时制
  int minute=c1.get(Calendar.MINUTE);//分
  int second=c1.get(Calendar.SECOND);//秒
  int day=c1.get(Calendar.DAY_OF_WEEK);//1代表周日，2代表周一

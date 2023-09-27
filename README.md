# My-Spark
This is a swing project, it includes datepicker for Swing application

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

UtilDateModel model = new UtilDateModel();
		
model.setDate(2023, 7, 18);
model.setSelected(true);
Properties p = new Properties();
p.put("text.today", "Today");
p.put("text.month", "Month");
p.put("text.year", "Year");
JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

datePicker.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				String showname=jComboBox1.getSelectedItem().toString();
				String dateval = "" + model.getValue();
				String[] datearray = dateval.split(" ");
				String strdate = datearray[1] + "-" + datearray[2] + "-" + datearray[5];
				String searchkey=showname+","+strdate;
				System.out.println("datePicker > searchkey:"+searchkey);
				populateBoxes(searchkey);
  }
});

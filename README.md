# My-Sparks
This is a swing project, it includes datepicker for Swing application
import the packages like this
```
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
```

Add the datepicker like this

```
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
```

Screenshots:
![image](https://github.com/balayesu-chilakalapudi/My-Sparks/assets/131433146/32b2c372-9f7b-42ba-ab1e-2f8f9a25e196)

![image](https://github.com/balayesu-chilakalapudi/My-Sparks/assets/131433146/5c776d91-05e7-465c-91be-8c27f8a1ee36)

![image](https://github.com/balayesu-chilakalapudi/My-Sparks/assets/131433146/506663f0-9edc-4d59-ba2b-af67731f22ff)




package com.java.Tuan_3;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class controller {

	String num = "";
	String caculate = "";
	String num2 = "";
	int flag = 0;
	String display="";
	
	@FXML
	TextField txtDisplay;
	
	@FXML
	TextField txtDisplay2;
	
	@FXML
	private void num1Clicked()
	{
	    System.out.println("You clicked me!");
	    if(flag==0)
	    {
	    	num += 1;
	    	display += 1;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=1;
	    	display += 1;
	    	txtDisplay.setText(num2);
	    }
	}
	
	@FXML
	private void num2Clicked()
	{
		System.out.println("You clicked me!");
		if(flag==0)
	    {
	    	num += 2;
	    	display += 2;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=2;
	    	display += 2;
	    	txtDisplay.setText(num2);
	    }
	    
	}
	
	@FXML
	private void num3Clicked()
	{
		if(flag==0)
	    {
	    	num += 3;
	    	display += 3;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=3;
	    	display += 3;
	    	txtDisplay.setText(num2);
	    }
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void num4Clicked()
	{
		System.out.println("You clicked me!");
		if(flag==0)
	    {
	    	num += 4;
	    	display += 4;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=4;
	    	display += 4;
	    	txtDisplay.setText(num2);
	    }
	}
	
	@FXML
	private void num5Clicked()
	{
		System.out.println("You clicked me!");
		if(flag==0)
	    {
	    	num += 5;
	    	display += 5;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=5;
	    	display += 5;
	    	txtDisplay.setText(num2);
	    }
	}
	
	@FXML
	private void num6Clicked()
	{
		if(flag==0)
	    {
	    	num += 6;
	    	display += 6;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=6;
	    	display += 6;
	    	txtDisplay.setText(num2);
	    }
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void num7Clicked()
	{
		if(flag==0)
	    {
	    	num += 7;
	    	display += 7;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=7;
	    	display += 7;
	    	txtDisplay.setText(num2);
	    }
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void num8Clicked()
	{
		if(flag==0)
	    {
	    	num += 8;
	    	display += 8;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=8;
	    	display += 8;
	    	txtDisplay.setText(num2);
	    }
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void num9Clicked()
	{
		if(flag==0)
	    {
	    	num += 9;
	    	display += 9;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=9;
	    	display += 9;
	    	txtDisplay.setText(num2);
	    }
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void num0Clicked()
	{
		if(flag==0)
	    {
	    	num += 0;
	    	display += 0;
	    	txtDisplay.setText(num);
	    }
	    else
	    {
	    	num2 +=0;
	    	display += 0;
	    	txtDisplay.setText(num2);
	    }
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numDivClicked()
	{
		display += "/";
		if(flag == 0)
		{
			txtDisplay.setText("");
			flag++;
			txtDisplay2.setText(display);
		}
		else
		{
			int kq = Integer.parseInt(num) / Integer.parseInt(num2);
			String a = String.valueOf(kq);
			num = a;
			num2 = "0";
			txtDisplay.setText(a);
			txtDisplay2.setText(display);
		}
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numPlusClicked()
	{
		
		display += "+";
		if(flag == 0)
		{
			txtDisplay.setText("");
			flag++;
			txtDisplay2.setText(display);
		}
		else
		{
			int kq = Integer.parseInt(num) + Integer.parseInt(num2);
			String a = String.valueOf(kq);
			num = a;
			num2 = "0";
			txtDisplay.setText(a);
			txtDisplay2.setText(display);
		}
		
		
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numModClicked()
	{
		caculate = "%";
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numSubmitClicked()
	{
		int kq = Integer.parseInt(num) + Integer.parseInt(num2);
		String a = String.valueOf(kq);
		num = a;
		num2 = "0";
		txtDisplay.setText(a);
		txtDisplay2.setText(display);
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numSqrtClicked()
	{
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numNegativeClicked()
	{
		display += "-";
		if(flag == 0)
		{
			txtDisplay.setText("");
			flag++;
			txtDisplay2.setText(display);
		}
		else
		{
			int kq = Integer.parseInt(num) - Integer.parseInt(num2);
			String a = String.valueOf(kq);
			num = a;
			num2 = "0";
			txtDisplay.setText(a);
			txtDisplay2.setText(display);
		}
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numMulClicked()
	{
		display += "x";
		if(flag == 0)
		{
			txtDisplay.setText("");
			flag++;
			txtDisplay2.setText(display);
		}
		else
		{
			int kq = Integer.parseInt(num) * Integer.parseInt(num2);
			String a = String.valueOf(kq);
			num = a;
			num2 = "0";
			txtDisplay.setText(a);
			txtDisplay2.setText(display);
		}
		System.out.println("You clicked me!");
	}
	
	@FXML
	private void numDeleteClicked()
	{
		num = "0";
		num2 = "0";
		caculate = "";
		txtDisplay.setText("0");
	}
	
	public void caculator()
	{
		
	}
	
}

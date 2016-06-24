package GUI;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Information extends Frame{
	TextField name;
	Choice sex = new Choice();// ��� �ڽ� �Ҷ� ���Ǵ� ��
	TextField phoneNumF;
	TextField phoneNumM;
	TextField phoneNumL;
	Button insert;
	TextArea area;
	Label phone1;
	Label phone2;
	Label nameF; // �̸� :
	Label sexF; // ���� :
	Label phoneF; // ��ȭ��ȣ :
	public Information(){
		setLayout(new FlowLayout());
		
		name = new TextField(5);
		sex.add("man");
		sex.add("woman");
		phoneNumF = new TextField(2);
		phoneNumM = new TextField(2);
		phoneNumL = new TextField(2);
		insert = new Button("�Է�");
		insert.addActionListener(new Informer());
		area = new TextArea(30,30);		
		phone1 = new Label("-"); //��ȭ��ȣ �������̴�.
		phone2 = new Label("-");
		nameF = new Label("�̸� : ");
		sexF = new Label("���� : ");
		phoneF = new Label("��ȭ��ȣ : ");
		
		add(nameF);
		add(name);
		add(sexF);
		add(sex);
		add(phoneF);
		add(phoneNumF);
		add(phone1);
		add(phoneNumM);
		add(phone2);
		add(phoneNumL);
		add(insert);
		add(area);		

		//public void insertDB �̷��� �޼ҵ带 �ϳ� ���� insert�� �� �� �ִ� �޼ҵ带 �ϳ� ����� ����
		// ���� Area�� ��°� ��- ����ȯ(��) : 010-8547-0201 �̷��� ����� �� sql�� insert�� ����.

	}
	public class Informer implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==insert){
				//�޼ҵ带 �̿��ؼ� SQL�� �Է��ϴ°�.
				String sexs ="";
				String names = name.getText();
				if (sex.getSelectedItem().equals("man")){
					sexs = sex.getSelectedItem();
				
				}else if(sex.getSelectedItem().equals("woman")){
					sexs = sex.getSelectedItem();
				}
				String phones = phoneNumF.getText()+"-"+phoneNumM.getText()+"-"+phoneNumL.getText();
				InsertDb(names, sexs ,phones);
			}
		
		}
	}
	
	public void InsertDb(String names,String sexs,String phones){
		Connection myCon = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
			String query = "insert into information values (?,?,?)";
			PreparedStatement pstmt = myCon.prepareStatement(query); //�ܿ�� �١ڡ�
			pstmt.setString(1, names);
			pstmt.setString(2, sexs);
			pstmt.setString(3, phones);
			pstmt.executeUpdate();
			
			query = "select * from information";
			pstmt = myCon.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				area.append(rs.getString("name") +"("+ rs.getString("sex")+") : "+rs.getString("phone")+"\n");
			}
			rs.close(); 
			pstmt.close(); 
			myCon.close(); 
		}catch(Exception e){
			System.out.println("����");
		}
		//name : varchar(30) , sex : varchar(3) , phone : varchar(13)
	}
}


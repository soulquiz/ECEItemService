/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.eceitem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author soulq
 */
@WebService(serviceName = "ECEItemWS")
@Stateless()
public class ECEItemWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLastOrder")
    public Object getLastOrder() {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_CONNECTION_STRING = "jdbc:mysql://aaciq4ouz6pazz.cimyxesey95t.ap-northeast-1.rds.amazonaws.com:3306/ece_item" + "?user=root&password=password";
            connect = DriverManager.getConnection(JDBC_CONNECTION_STRING);

            if(connect != null){
                System.out.println("Database Connected");
                System.out.println("-------------------------------------------");
                // sql query instruction
                Statement stmt = connect.createStatement();  // create Object of statement to make query
                String sql = "select id, name, price, description, location, status, note, res_name as responsible_name, item.order_no as order_number\n"
                        + "	 ,company.c_name as company_name, company.address as company_address\n"
                        + "from ((item\n"
                        + "inner join froms on item.order_no = froms.order_no)\n"
                        + "inner join company on froms.c_name = company.c_name)\n"
                        + "where item.order_no = (\n"
                        + "	select max(order_no) from orders\n"
                        + "	);";
                ResultSet rec = stmt.executeQuery(sql);  // execute and keep in Object of ResultSet

                if(!rec.next())  // move cursor forward one row if have next row return true
                {
                    System.out.println("No Records are found");
                } else {  // if have rows
                    try{
                        DocumentBuilderFactory dbFactory =
                        DocumentBuilderFactory.newInstance();
                        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                        Document doc = dBuilder.newDocument();

                        // root element
                        Element rootElement = doc.createElement("itemInformation");
                        doc.appendChild(rootElement);

                        do{
                            // item element
                            Element item = doc.createElement("item");
                            rootElement.appendChild(item);
                            Attr attr = doc.createAttribute("id");  // add id attribute
                            attr.setValue(rec.getString("id"));  // get string from column name in ResultSet
                            item.setAttributeNode(attr);

                            // item name element
                            Element item_name = doc.createElement("name");
                            item.appendChild(item_name);
                            item_name.appendChild(doc.createTextNode(rec.getString("name")));

                            // item price element
                            Element item_price = doc.createElement("price");
                            item.appendChild(item_price);
                            item_price.appendChild(doc.createTextNode(String.valueOf(rec.getInt("price"))));

                            // item description element
                            Element item_description = doc.createElement("description");
                            item.appendChild(item_description);
                            item_description.appendChild(doc.createTextNode(rec.getString("description")));

                            // item location element
                            Element item_location = doc.createElement("location");
                            item.appendChild(item_location);
                            item_location.appendChild(doc.createTextNode(rec.getString("location")));

                            // item status element
                            Element item_status = doc.createElement("status");
                            item.appendChild(item_status);
                            item_status.appendChild(doc.createTextNode(rec.getString("status")));

                            // item note element
                            Element item_note = doc.createElement("note");
                            item.appendChild(item_note);
                            item_note.appendChild(doc.createTextNode(rec.getString("note")));

                            // item responsible name element
                            Element item_responsible_name = doc.createElement("responsible_name");
                            item.appendChild(item_responsible_name);
                            item_responsible_name.appendChild(doc.createTextNode(rec.getString("responsible_name")));

                            // item order number element
                            Element item_order_number = doc.createElement("order_number");
                            item.appendChild(item_order_number);
                            item_order_number.appendChild(doc.createTextNode(rec.getString("order_number")));

                            // item company name element
                            Element item_company_name = doc.createElement("company_name");
                            item.appendChild(item_company_name);
                            item_company_name.appendChild(doc.createTextNode(rec.getString("company_name")));

                            //item company address element
                            Element item_company_address = doc.createElement("company_address");
                            item.appendChild(item_company_address);
                            item_company_address.appendChild(doc.createTextNode(rec.getString("company_address")));

                        }
                        while(rec.next());  // move cursor forward one row

                    // write the content into xml file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);


                    // Output to console for testing
                    StreamResult consoleResult = new StreamResult(System.out);
                    transformer.transform(source, consoleResult);

                    return (source);

                    } catch (Exception e){
                                e.printStackTrace();
                    }
                }

            } else {
                System.out.println("Cant Connect Database");
                return null;
            }
        } catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Close
        try {
            if(connect != null){
                connect.close();
            }
        } catch (SQLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // default return to client
        System.out.println("Error");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getOrder")
    public Object getOrder(@WebParam(name = "orderNumber") int orderNumber) {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_CONNECTION_STRING = "jdbc:mysql://aaciq4ouz6pazz.cimyxesey95t.ap-northeast-1.rds.amazonaws.com:3306/ece_item" + "?user=root&password=323643123";
            connect = DriverManager.getConnection(JDBC_CONNECTION_STRING);

            if(connect != null){
                System.out.println("Database Connected");
                System.out.println("-------------------------------------------");
                // sql query instruction
                Statement stmt = connect.createStatement();  // create Object of statement to make query
                String sql = "select id, name, price, description, location, status, note, res_name as responsible_name, item.order_no as order_number\n"
                        + "	 ,company.c_name as company_name, company.address as company_address\n"
                        + "from ((item\n"
                        + "inner join froms on item.order_no = froms.order_no)\n"
                        + "inner join company on froms.c_name = company.c_name)\n"
                        + "where item.order_no = (\n"
                        + "	" + orderNumber + "\n"
                        + "	);";
                ResultSet rec = stmt.executeQuery(sql);  // execute and keep in Object of ResultSet

                if(!rec.next())  // move cursor forward one row if have next row return true
                {
                    System.out.println("No Records are found");
                } else {  // if have rows
                    try{
                        DocumentBuilderFactory dbFactory =
                        DocumentBuilderFactory.newInstance();
                        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                        Document doc = dBuilder.newDocument();

                        // root element
                        Element rootElement = doc.createElement("itemInformation");
                        doc.appendChild(rootElement);

                        do{
                            // item element
                            Element item = doc.createElement("item");
                            rootElement.appendChild(item);
                            Attr attr = doc.createAttribute("id");  // add id attribute
                            attr.setValue(rec.getString("id"));  // get string from column name in ResultSet
                            item.setAttributeNode(attr);

                            // item name element
                            Element item_name = doc.createElement("name");
                            item.appendChild(item_name);
                            item_name.appendChild(doc.createTextNode(rec.getString("name")));

                            // item price element
                            Element item_price = doc.createElement("price");
                            item.appendChild(item_price);
                            item_price.appendChild(doc.createTextNode(String.valueOf(rec.getInt("price"))));

                            // item description element
                            Element item_description = doc.createElement("description");
                            item.appendChild(item_description);
                            item_description.appendChild(doc.createTextNode(rec.getString("description")));

                            // item location element
                            Element item_location = doc.createElement("location");
                            item.appendChild(item_location);
                            item_location.appendChild(doc.createTextNode(rec.getString("location")));

                            // item status element
                            Element item_status = doc.createElement("status");
                            item.appendChild(item_status);
                            item_status.appendChild(doc.createTextNode(rec.getString("status")));

                            // item note element
                            Element item_note = doc.createElement("note");
                            item.appendChild(item_note);
                            item_note.appendChild(doc.createTextNode(rec.getString("note")));

                            // item responsible name element
                            Element item_responsible_name = doc.createElement("responsible_name");
                            item.appendChild(item_responsible_name);
                            item_responsible_name.appendChild(doc.createTextNode(rec.getString("responsible_name")));

                            // item order number element
                            Element item_order_number = doc.createElement("order_number");
                            item.appendChild(item_order_number);
                            item_order_number.appendChild(doc.createTextNode(rec.getString("order_number")));

                            // item company name element
                            Element item_company_name = doc.createElement("company_name");
                            item.appendChild(item_company_name);
                            item_company_name.appendChild(doc.createTextNode(rec.getString("company_name")));

                            //item company address element
                            Element item_company_address = doc.createElement("company_address");
                            item.appendChild(item_company_address);
                            item_company_address.appendChild(doc.createTextNode(rec.getString("company_address")));

                        }
                        while(rec.next());  // move cursor forward one row

                    // write the content into xml file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);


                    // Output to console for testing
                    StreamResult consoleResult = new StreamResult(System.out);
                    transformer.transform(source, consoleResult);

                    return (source);

                    } catch (Exception e){
                                e.printStackTrace();
                    }
                }

            } else {
                return null;
            }
        } catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Close
        try {
            if(connect != null){
                connect.close();
            }
        } catch (SQLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // default return to client
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getExamineInfo")
    public Object getExamineInfo(@WebParam(name = "orderNumber") int orderNumber) {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_CONNECTION_STRING = "jdbc:mysql://aaciq4ouz6pazz.cimyxesey95t.ap-northeast-1.rds.amazonaws.com:3306/ece_item" + "?user=root&password=323643123";
            connect = DriverManager.getConnection(JDBC_CONNECTION_STRING);
            if(connect != null){
                System.out.println("Database Connected");
                System.out.println("-------------------------------------------");
                // sql query instruction
                Statement stmt = connect.createStatement();  // create Object of statement to make query
                String sql = "select p_name, department, examine.order_no, examine.rank\n" +
                    "from personal\n" +
                    "inner join examine \n" +
                    "on personal.p_name = examine.exam_name\n" +
                    "where examine.order_no = (\n" +
                    "		" + orderNumber + "\n" +
                    ");";
                ResultSet rec = stmt.executeQuery(sql);  // execute and keep in Object of ResultSet

                if(!rec.next())  // move cursor forward one row if have next row return true
                {
                    System.out.println("No Records are found");
                } else {  // if have rows
                    try{
                        DocumentBuilderFactory dbFactory =
                        DocumentBuilderFactory.newInstance();
                        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                        Document doc = dBuilder.newDocument();

                        // root element
                        Element rootElement = doc.createElement("personalInformation");
                        doc.appendChild(rootElement);

                        do{
                            // item element
                            Element item = doc.createElement("personal");
                            rootElement.appendChild(item);
                            Attr attr = doc.createAttribute("name");  // add id attribute
                            attr.setValue(rec.getString("p_name"));  // get string from column name in ResultSet
                            item.setAttributeNode(attr);

                            // item name element
                            Element item_name = doc.createElement("department");
                            item.appendChild(item_name);
                            item_name.appendChild(doc.createTextNode(rec.getString("department")));

                            // item price element
                            Element item_price = doc.createElement("order_number");
                            item.appendChild(item_price);
                            item_price.appendChild(doc.createTextNode(String.valueOf(rec.getInt("order_no"))));

                            // item description element
                            Element item_description = doc.createElement("rank");
                            item.appendChild(item_description);
                            item_description.appendChild(doc.createTextNode(rec.getString("rank")));

                        }
                        while(rec.next());  // move cursor forward one row

                    // write the content into xml file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);


                    // Output to console for testing
                    StreamResult consoleResult = new StreamResult(System.out);
                    transformer.transform(source, consoleResult);

                    return (source);

                    } catch (Exception e){
                                e.printStackTrace();
                    }
                }

            } else {
                System.out.println("Database Connect Failed.");
                return null;
            }
        } catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Close
        try {
            if(connect != null){
                connect.close();
            }
        } catch (SQLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // default return to client
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTakeInfo")
    public Object getTakeInfo(@WebParam(name = "orderNumber") int orderNumber) {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String JDBC_CONNECTION_STRING = "jdbc:mysql://aaciq4ouz6pazz.cimyxesey95t.ap-northeast-1.rds.amazonaws.com:3306/ece_item" + "?user=root&password=323643123";
            connect = DriverManager.getConnection(JDBC_CONNECTION_STRING);
            if(connect != null){
                System.out.println("Database Connected");
                System.out.println("-------------------------------------------");
                // sql query instruction
                Statement stmt = connect.createStatement();  // create Object of statement to make query
                String sql = "select take_name as name, personal.department , order_no, take_date \n" +
                    "from orders\n" +
                    "inner join personal\n" +
                    "on orders.take_name = personal.p_name\n" +
                    "where orders.order_no = (\n" +
                    "		" + orderNumber + "\n" +
                    ");";
                ResultSet rec = stmt.executeQuery(sql);  // execute and keep in Object of ResultSet

                if(!rec.next())  // move cursor forward one row if have next row return true
                {
                    System.out.println("No Records are found");
                } else {  // if have rows
                    try{
                        DocumentBuilderFactory dbFactory =
                        DocumentBuilderFactory.newInstance();
                        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                        Document doc = dBuilder.newDocument();

                        // root element
                        Element rootElement = doc.createElement("personalInformation");
                        doc.appendChild(rootElement);

                        do{
                            // item element
                            Element item = doc.createElement("personal");
                            rootElement.appendChild(item);
                            Attr attr = doc.createAttribute("name");  // add id attribute
                            attr.setValue(rec.getString("name"));  // get string from column name in ResultSet
                            item.setAttributeNode(attr);

                            // item name element
                            Element item_name = doc.createElement("department");
                            item.appendChild(item_name);
                            item_name.appendChild(doc.createTextNode(rec.getString("department")));

                            // item price element
                            Element item_price = doc.createElement("order_number");
                            item.appendChild(item_price);
                            item_price.appendChild(doc.createTextNode(String.valueOf(rec.getInt("order_no"))));

                            // item description element
                            Element item_description = doc.createElement("take_date");
                            item.appendChild(item_description);
                            item_description.appendChild(doc.createTextNode(rec.getString("take_date")));

                        }
                        while(rec.next());  // move cursor forward one row

                    // write the content into xml file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);


                    // Output to console for testing
                    StreamResult consoleResult = new StreamResult(System.out);
                    transformer.transform(source, consoleResult);

                    return (source);

                    } catch (Exception e){
                                e.printStackTrace();
                    }
                }

            } else {
                System.out.println("Database Connect Failed.");
                return null;
            }
        } catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Close
        try {
            if(connect != null){
                connect.close();
            }
        } catch (SQLException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // default return to client
        return null;
    }
}

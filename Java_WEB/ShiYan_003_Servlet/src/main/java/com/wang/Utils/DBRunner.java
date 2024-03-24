package com.wang.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class DBRunner<T> {


    public List<T> Query(String sql, Class clazz, Object...params){

        PreparedStatement preparedStatement = null;
        Connection connection = null;
        ResultSet resultSet = null;

        List<T> list = new ArrayList<>();

        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                String clasName = params[i].getClass().getSimpleName();
//                System.out.println(clasName);
                switch (clasName) {
                    case "String":
                        preparedStatement.setString(i + 1, (String) params[i]);
                        break;
                    case "Integer":
                        preparedStatement.setInt(i + 1, (int) params[i]);
                        break;
                    case "Double":
                        preparedStatement.setDouble(i + 1, (Double) params[i]);
                        break;
                    case "int":
                        preparedStatement.setInt(i + 1, (int) params[i]);
                        break;
                    case "Date" :
                        break;
                    default:
                        throw new MyClassNotFoundException("参数类型错误");
                }
            }

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

//                通过class反射获取构造器
                Constructor constructor = clazz.getConstructor();

                T t = (T)constructor.newInstance();

//                获取类的属性
                Field[] fields = clazz.getDeclaredFields();

//              获取方法
                Method[] methods = clazz.getDeclaredMethods();

                for (Field field : fields) {
//                    获取属性的类型
                    String simpleName = field.getType().getSimpleName();

                    switch (simpleName) {
                        case "String":
                            //数据库查询出来的值
                            String string = resultSet.getString(field.getName());
                            if (string != null) {
                                for (Method method : methods) {
                                    String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                    if (method.getName().equals(methodName)) {
                                        method.invoke(t, string);
                                    }
                                }
                            }
                            break;
                        case "int":
//                            System.out.println(1111);
                            int anInt = resultSet.getInt(field.getName());
                            for (Method method : methods) {
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, anInt);
                                }

                            }
                            break;
                        case "Integer":{
                            Integer value = resultSet.getInt(field.getName());
                            for (Method method : methods) {
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, value);
                                }
                            }
                        } break;
                        case "boolean": {
                            boolean value = resultSet.getBoolean(field.getName());
                            for (Method method : methods) {
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, value);
                                }

                            }
                            break;
                        }
                        case "Double": {
                            Double value = resultSet.getDouble(field.getName());
                            for (Method method : methods) {
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, value);
                                }

                            }
                            break;
                        }
                        case "Float": {
                            float value = resultSet.getFloat(field.getName());
                            for (Method method : methods) {
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, value);
                                }

                            }
                            break;
                        }
                        case "Date":{
                            Date date = resultSet.getDate(field.getName());
                            for (Method method : methods){
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, date);
                                }
                            }
                        }
                        case"Timestamp":{
                            Timestamp timestamp = resultSet.getTimestamp(field.getName());
                            for (Method method : methods){
                                String methodName = "set" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
                                if (method.getName().equals(methodName)) {
                                    method.invoke(t, timestamp);
                                }
                            }

                        }break;
                        default:{
                            new RuntimeException("类型没写完");
                        }
                    }
                }
                list.add(t);
            }

        } catch (SQLException |
                 InvocationTargetException |
                 NoSuchMethodException |
                 InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection(resultSet,preparedStatement,connection);
        }

        return list;
    }

    public int Update(String sql,Object...params){
        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);



            for (int i = 0; i < params.length; i++) {

                String clasName = params[i].getClass().getSimpleName();
//                System.out.println(clasName);
                switch (clasName) {
                    case "String":
                        preparedStatement.setString(i + 1, (String) params[i]);
                        break;
                    case "Integer":
                        preparedStatement.setInt(i + 1, (int) params[i]);
                        break;
                    case "Double":
                        preparedStatement.setDouble(i + 1, (Double) params[i]);
                        break;
                    case "int":
                        preparedStatement.setDouble(i + 1, (Double) params[i]);
                        break;
                    default:
                        throw new MyClassNotFoundException("参数类型错误");
                }

            }
            int i = preparedStatement.executeUpdate();

            return i;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.closeConnection(preparedStatement,connection);
        }

    }

}


package com.gem.demo.dao;

import com.gem.demo.util.DBInfo;
import com.gem.demo.util.IParseRs;

import java.sql.*;
import java.util.List;

public class BaseDAO<T> {
    private Connection conn = null;
    private PreparedStatement psmt = null;
    private ResultSet rs = null;

    private Connection getConnection(){
        try {
            Class.forName(DBInfo.DRIVER);
            return DriverManager.getConnection(DBInfo.URL, DBInfo.USER, DBInfo.PWD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private  void close(Connection conn,PreparedStatement psmt,ResultSet rs){
        try {
            if (rs != null) {
                rs.close();
            }
            if (psmt != null) {
                psmt.close();
            }
            if (conn != null) {
                conn.close();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected boolean executeUpdate(String sql,Object... params){
        //
        try {
            conn=getConnection();
            psmt=conn.prepareStatement(sql);
            //参数参数不定   类型不定    没有参数
            setParams(params);
            return psmt.executeUpdate()>0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            close(conn, psmt, rs);
        }
        return false;
    }

    private void setParams(Object... params){
        //可变参数用法与数组一样
        try {

            for(int i=0;i<params.length;i++){
                psmt.setObject(i+1, params[i]);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected List<T> executeQuery(IParseRs<T> parseRs, String sql, Object... params){
        try {
            conn=getConnection();
            psmt=conn.prepareStatement(sql);
            setParams(params);
            rs=psmt.executeQuery();
            return parseRs.parseRS(rs);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            close(conn, psmt, rs);
        }
        return null;

    }


    protected T load(IParseRs<T> parseRs,String sql,Object... params){
        List<T> list=executeQuery(parseRs, sql, params);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }else{

            return null;
        }
    }


}
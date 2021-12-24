package com.company.design.Facade;

public class SFtpClient {

    private FTP ftp;
    private Reader reader;
    private  Writer writer;

    public SFtpClient(FTP ftp, Reader reader, Writer writer ){
        this.ftp=ftp;
        this.reader=reader;
        this.writer=writer;
    }

    public SFtpClient(String host, int port, String path, String fileName){
        this.ftp=new FTP(host, port, path);
        this.reader=new Reader(fileName);
        this.writer=new Writer(fileName);
    }

    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileDisConnect();
        reader.fileConnect();
    }

    public void disConnect(){
        writer.fileDisConnect();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read(){
        reader.fileRead();
    }
    public void write(){
        writer.write();
    }


}

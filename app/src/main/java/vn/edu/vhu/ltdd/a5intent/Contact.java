package vn.edu.vhu.ltdd.a5intent;
import android.os.Parcel; import android.os.Parcelable;
public class Contact implements Parcelable {
 private String hoTen,dienThoai,email;
 public Contact(String h,String d,String e){hoTen=h;dienThoai=d;email=e;}
 protected Contact(Parcel in){hoTen=in.readString();dienThoai=in.readString();email=in.readString();}
 public void writeToParcel(Parcel dest,int flags){dest.writeString(hoTen);dest.writeString(dienThoai);dest.writeString(email);}
 public int describeContents(){return 0;}
 public static final Creator<Contact> CREATOR=new Creator<Contact>(){public Contact createFromParcel(Parcel in){return new Contact(in);}public Contact[] newArray(int size){return new Contact[size];}};
 public String getHoTen(){return hoTen;} public String getDienThoai(){return dienThoai;} public String getEmail(){return email;} public void setHoTen(String s){hoTen=s;}
}

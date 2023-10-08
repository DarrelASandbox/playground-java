package src._23javaIOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _13BinaryFloats {
  public static void main(String[] args) {
    float list[] = { 10.5f, 2.9f, 6.4f, 3.7f };
    String filePath = "abdul-bari/src/_23javaIOStreams/file.txt";

    try {
      FileOutputStream fos = new FileOutputStream(filePath);
      DataOutputStream dos = new DataOutputStream(fos);

      dos.writeInt(list.length);
      for (float value : list)
        dos.writeFloat(value);

      fos.close();
      dos.close();

      FileInputStream fis = new FileInputStream(filePath);
      DataInputStream dis = new DataInputStream(fis);

      int listLength = dis.readInt();
      float[] readList = new float[listLength];
      for (int i = 0; i < listLength; i++) {
        readList[i] = dis.readFloat();
        System.out.println(readList[i]);
      }

      fis.close();
      dis.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

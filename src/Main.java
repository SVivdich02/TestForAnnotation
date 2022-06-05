import org.example.annotation.GlobalList;
import org.example.annotation.MyButtonGenerated;
import org.example.annotation.MyFrameGenerated;
import org.example.annotation.MyPanelGenerated;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        MyFrameGenerated app = new MyFrameGenerated();
        Rectangle r = new Rectangle();
        r.height = 500;
        r.x = 200;
        r.y = 200;
        r.width = 500;
        app.setBounds(r);
        app.setVisible(true);

        MyPanelGenerated panel = new MyPanelGenerated();
        panel.setBackground(Color.ORANGE);

        app.setTitle("У меня есть двойник?");
        app.add(panel);

        int correctlySize = GlobalList.list.size();
        for (int i = 0; i < correctlySize; i++)
        {
            System.out.println(GlobalList.list.get(i).getMethodName() + " " + GlobalList.list.get(i).getClassName() + " " + GlobalList.list.get(i).getParamValuesMap());
        }
        System.out.println();

        GlobalList.runList(GlobalList.list.size());
    }
}

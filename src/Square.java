public class Square
{
    private int row;
    private int col;
    private int type;
    public Square previous;

    public Square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
        this.previous = null;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public void setType(int newType)
    {
        type = newType;
    }

    public int getType()
    {
        return type;
    }

    public String toString()
    {
        String str = "";
        switch(type)
        {
            case 0:
                str += "_";
                break;
            case 1:
                str += "#";
                break;
            case 2:
                str += "S";
                break;
            case 3:
                str += "E";
                break;
            case 4:
                str += "O";
                break;
            case 5:
                str += "X";
                break;
        }
        return str;
    }
}
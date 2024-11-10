public class Square
{
    private int row;
    private int col;
    private int type;
    public Square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public int getType()
    {
        return type;
    }

    public String toString()
    {
        String str;
        switch(type)
        {
            case 0:
                str += "_";
                break;
            case 1:
                str += "#";
                break;
            case 2:
                str += "S"
                break;
            case 3:
                str += "E";
                break;
        }
        return str;
    }
}
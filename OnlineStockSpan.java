class StockSpanner {
    Stack<Data> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && price >= stack.peek().value){
            Data data = stack.pop();
            span += data.days;
        }
        stack.push(new Data(price, span));
        return span;
    }
}

class Data{
    int value = 0;
    int days = 0;

    public Data(int value, int days){
        this.value = value;
        this.days = days;
    }
}

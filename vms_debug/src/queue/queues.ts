export class Queue<T>
{
    private data : any[] = [];

    push = (item: T) => this.data.push(item);
    pop = (): T => this.data.shift();
    size = () : number => this.data.length;
}
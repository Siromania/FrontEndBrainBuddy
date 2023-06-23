export interface ChartTest {
    history: History[]
}
  
interface History {
    timestamp: number
    score: number
    colorcode: string
}
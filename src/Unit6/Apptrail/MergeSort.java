package Unit6.Apptrail;

/**
 * Mergesort implementation that sorts Waypoints using a WaypointComparator object.
 * Based on Double merge sort implementation by JCochran
 * @author 21brownz
 * @version 03-04-2020
 */

public class MergeSort	{
    private Waypoint[] temp;
    private WaypointComparator wc;

    public MergeSort(WaypointComparator wc){
       this.wc = wc;
    }

    /** Sorts a[0], ..., a[a.length-1] in ascending order
     *  using the Mergesort algorithm.
     */
    public void sort(Waypoint[] a)	{
        int n = a.length;
        temp = new Waypoint[n];
        recursiveSort(a, 0, n-1);
    }

    /** Recursive helper method: sorts a[from], ..., a[to]
     * @param a array
     * @param from low index
     * @param to high index
     */
    private void recursiveSort(Waypoint[] a, int from, int to)	{
        if (to - from < 2)	{       // Base case: 1 or 2 elements
            if (to > from && wc.compare(a[to], a[from]) < 0)	{
                // swap a[to] and a[from]
                Waypoint aTemp = a[to];
                a[to] = a[from];
                a[from] = aTemp;
            }
        }
        else{// Recursive case
            int middle = (from + to) / 2;
            recursiveSort(a, from, middle);
            recursiveSort(a, middle + 1, to);
            merge(a, from, middle, to);
        }
    }

    /** Merges a[from] ... a[middle] and a[middle+1] ... a[to]
     *  into one sorted array a[from] ... a[to]
     * @param a array
     * @param from low index
     * @param middle pivot point
     * @param to high index
     */
    private void merge(Waypoint[] a, int from, int middle, int to)	{
        int i = from, j = middle + 1, k = from;

        // While both arrays have elements left unprocessed:
        while (i <= middle && j <= to)	{
            if (wc.compare(a[i], a[j]) < 0)	{
                temp[k] = a[i];   // Or simply temp[k] = a[i++];
                i++;
            }
            else	{
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        // Copy the tail of the first half, if any, into temp:
        while (i <= middle)	{
            temp[k] = a[i];     // Or simply temp[k++] = a[i++]
            i++;
            k++;
        }

        // Copy the tail of the second half, if any, into temp:
        while (j <= to)	{
            temp[k] = a[j];     // Or simply temp[k++] = a[j++]
            j++;
            k++;
        }

        // Copy temp back into a, the original array
        for (k = from; k <= to; k++)
            a[k] = temp[k];
    }
}
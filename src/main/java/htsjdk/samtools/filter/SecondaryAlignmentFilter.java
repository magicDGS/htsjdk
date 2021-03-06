package htsjdk.samtools.filter;

import htsjdk.samtools.SAMRecord;

/**
 * SamRecordFilter that filters out secondary alignments, but not supplemental alignments.
 */
public class SecondaryAlignmentFilter implements SamRecordFilter {
    /**
     * Returns true if the read is marked as secondary.
     */
    @Override
    public boolean filterOut(final SAMRecord record) { return record.isSecondaryAlignment(); }

    /**
     * Returns true if either read is marked as secondary.
     */
    @Override
    public boolean filterOut(final SAMRecord first, final SAMRecord second) {
        return first.isSecondaryAlignment() || second.isSecondaryAlignment();
    }
}

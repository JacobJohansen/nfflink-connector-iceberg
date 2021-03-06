package com.netflix.spaas.nfflink.connector.iceberg;

import java.util.concurrent.TimeUnit;

public class IcebergConnectorConstant {
    public static final String TYPE = "iceberg";

    public static final String ICEBERG_APP_TYPE = "flink";
    public static final String METACAT_HOST = "metacat_host";
    public static final String CATALOG = "catalog";
    public static final String DATABASE = "database";
    public static final String TABLE = "table";

    public static final String FORMAT = "format";
    public static final String CODEC = "codec";


    public static final String METACAT_HOST_HADOOP_CONF_KEY = "???";
    public static final String DEFAULT_METACAT_HOST = "???";

    public static final String SKIP_INCOMPATIBLE_RECORD = "skip_incompatible_record";
    public static final String VTTS_WATERMARK_TIMESTAMP_FIELD = "vtts_watermark_timestamp_field";
    public static final String VTTS_WATERMARK_TIMESTAMP_UNIT = "vtts_watermark_timestamp_unit";
    public static final String SNAPSHOT_RETENTION_HOURS = "snapshot_retention_hours";
    public static final String COMMIT_RESTORED_MANIFEST_FILES = "commit_restored_manifest_files";
    public static final String MAX_FILE_SIZE = "max_file_size";

    public static final boolean DEFAULT_SKIP_INCOMPATIBLE_RECORD = false;
    public static final String DEFAULT_VTTS_WATERMARK_TIMESTAMP_UNIT = TimeUnit.MILLISECONDS.name();
    public static final long DEFAULT_SNAPSHOT_RETENTION_HOURS = 70;
    public static final boolean DEFAULT_COMMIT_RESTORED_MANIFEST_FILES = true;
    public static final long DEFAULT_MAX_FILE_SIZE = 1024L * 1024L * 1024L * 4;

    public static final String SINK_TAG_KEY = "sink";
    public static final String OUTPUT_TAG_KEY = "output";
    public static final String OUTPUT_CLUSTER_TAG_KEY = "outputCluster";

    public static final String SUBTASK_ID = "subtask_id";
    public static final String EXCEPTION_CLASS = "exception_class";
}

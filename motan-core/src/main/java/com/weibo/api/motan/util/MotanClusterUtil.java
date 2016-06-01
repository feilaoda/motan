package com.weibo.api.motan.util;

import com.weibo.api.motan.cluster.Cluster;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by fld on 16/5/23.
 */
public class MotanClusterUtil {

    private static Set<Cluster> clusterSet = new HashSet<Cluster>();

    public static void addCluster(Cluster cluster) {
        clusterSet.add(cluster);
    }

    public static void destroy() {
        for(Cluster cluster: clusterSet) {
            cluster.destroy();
        }
        clusterSet.clear();
    }
}

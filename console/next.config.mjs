/** @type {import('next').NextConfig} */
const nextConfig = {
    output: 'export',
    trailingSlash: true,
    // Not using Next Image — disable the optimizer to remove GHSA-9g9p-9gw9-jx7f surface
    images: { unoptimized: true },
    experimental: {
        // Build-machinery only (no effect on the exported output):
        // webpackBuildWorker:false compiles in-process, workerThreads:true uses
        // worker_threads for the static export workers. Together they avoid
        // child_process fork/stdio-pipe spawns, which some build sandboxes
        // block with EPERM.
        webpackBuildWorker: false,
        workerThreads: true,
    },
};
export default nextConfig;

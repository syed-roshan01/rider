/**
 * api/[s1]/[s2].ts -- Vercel entry shard for 2-segment API paths.
 *
 * Hobby caps a deployment at 12 Serverless Functions, so all 54 routes
 * dispatch through api/_routes/dispatch.ts from four depth shards. Nothing is
 * routed by this file name; see api/_routes/dispatch.ts for the whole story.
 */
import dispatch from '../_routes/dispatch.js';

export default dispatch;

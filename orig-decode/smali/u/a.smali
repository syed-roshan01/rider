.class public final Lu/a;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public b:Lx/o;

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lu/a;->a:Ljava/util/LinkedHashMap;

    sget-wide v0, Ld1/c;->b:J

    iput-wide v0, p0, Lu/a;->c:J

    return-void
.end method

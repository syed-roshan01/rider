.class public final Lh0/j;
.super Ljava/lang/Object;

# interfaces
.implements Lo2/t;


# instance fields
.field public final a:Lh0/k;

.field public final b:Lh0/m;

.field public c:J


# direct methods
.method public constructor <init>(Lh0/k;Lh0/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/j;->a:Lh0/k;

    iput-object p2, p0, Lh0/j;->b:Lh0/m;

    sget p1, Ld1/c;->e:I

    sget-wide p1, Ld1/c;->b:J

    iput-wide p1, p0, Lh0/j;->c:J

    return-void
.end method

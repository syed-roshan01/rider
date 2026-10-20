.class public final Lh0/w0;
.super Ljava/lang/Object;

# interfaces
.implements Lh0/m;


# instance fields
.field public final synthetic a:Lh0/v0;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lh0/v0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/w0;->a:Lh0/v0;

    iput-boolean p2, p0, Lh0/w0;->b:Z

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lh0/w0;->a:Lh0/v0;

    iget-boolean v1, p0, Lh0/w0;->b:Z

    invoke-virtual {v0, v1}, Lh0/v0;->j(Z)J

    move-result-wide v0

    return-wide v0
.end method

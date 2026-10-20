.class public final Lea/f;
.super Ljava/lang/Object;


# instance fields
.field public final a:Z

.field public final b:Laa/f;

.field public c:Ljava/net/Socket;

.field public d:Ljava/lang/String;

.field public e:Lja/i;

.field public f:Lja/h;

.field public g:Lea/h;

.field public final h:La4/q;

.field public i:I


# direct methods
.method public constructor <init>(Laa/f;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lea/f;->a:Z

    iput-object p1, p0, Lea/f;->b:Laa/f;

    sget-object p1, Lea/h;->a:Lea/g;

    iput-object p1, p0, Lea/f;->g:Lea/h;

    sget-object p1, Lea/b0;->a:La4/q;

    iput-object p1, p0, Lea/f;->h:La4/q;

    return-void
.end method

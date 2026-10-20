.class public final Lt1/n1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lw0/a0;

.field public final b:Lt1/f;

.field public final c:Lt1/f;

.field public final d:Lt1/f;

.field public final e:Lt1/f;

.field public final f:Lt1/f;

.field public final g:Lt1/f;

.field public final h:Lt1/f;


# direct methods
.method public constructor <init>(Lu1/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw0/a0;

    invoke-direct {v0, p1}, Lw0/a0;-><init>(Lc9/c;)V

    iput-object v0, p0, Lt1/n1;->a:Lw0/a0;

    sget-object p1, Lt1/f;->x:Lt1/f;

    iput-object p1, p0, Lt1/n1;->b:Lt1/f;

    sget-object p1, Lt1/f;->y:Lt1/f;

    iput-object p1, p0, Lt1/n1;->c:Lt1/f;

    sget-object p1, Lt1/f;->z:Lt1/f;

    iput-object p1, p0, Lt1/n1;->d:Lt1/f;

    sget-object p1, Lt1/f;->t:Lt1/f;

    iput-object p1, p0, Lt1/n1;->e:Lt1/f;

    sget-object p1, Lt1/f;->u:Lt1/f;

    iput-object p1, p0, Lt1/n1;->f:Lt1/f;

    sget-object p1, Lt1/f;->v:Lt1/f;

    iput-object p1, p0, Lt1/n1;->g:Lt1/f;

    sget-object p1, Lt1/f;->w:Lt1/f;

    iput-object p1, p0, Lt1/n1;->h:Lt1/f;

    return-void
.end method


# virtual methods
.method public final a(Lt1/m1;Lc9/c;Lc9/a;)V
    .locals 1

    iget-object v0, p0, Lt1/n1;->a:Lw0/a0;

    invoke-virtual {v0, p1, p2, p3}, Lw0/a0;->c(Ljava/lang/Object;Lc9/c;Lc9/a;)V

    return-void
.end method
